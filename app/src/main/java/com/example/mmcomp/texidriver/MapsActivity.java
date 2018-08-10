package com.example.mmcomp.texidriver;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.maps.android.PolyUtil;
import com.onesignal.OneSignal;
import com.onesignal.OneSignal.IdsAvailableHandler;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    TextView name, place1, place2, message;
   Model model;
   Button button;
   com.google.gson.Gson gson;
   String pickPlace;
   List<ModelGsonData.RoutesBean> routesBeans;
   String going;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        name = findViewById(R.id.name);
        place1 = findViewById(R.id.pickup);
        place2 = findViewById(R.id.go);
        message = findViewById(R.id.msg);
        mapFragment.getMapAsync(this);
        button=findViewById(R.id.button);
        AndroidNetworking.initialize(getApplicationContext());
        gson=new Gson();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

         AndroidNetworking.get("https://maps.googleapis.com/maps/api/directions/json?origin="+pickPlace+"&destination="+going)
                 .setPriority(Priority.HIGH)
                 .build()
                 .getAsString(new StringRequestListener() {
                     @Override
                     public void onResponse(String response) {
                         Log.d("**", "" + response);
                         ModelGsonData modelGsonData = gson.fromJson("" + response, ModelGsonData.class);
                         mMap.clear();
                         routesBeans = modelGsonData.getRoutes();


                         BitmapDrawable bitmapDrawable;

                         bitmapDrawable = (BitmapDrawable) getResources().getDrawable(R.mipmap.carr);

                         Bitmap bitmap1 = bitmapDrawable.getBitmap();


                         Bitmap myicon = Bitmap.createScaledBitmap(bitmap1, 100, 100, false);

                         LatLng latLng = new LatLng(routesBeans.get(0).getLegs().get(0).getStart_location().getLat(),
                                 routesBeans.get(0).getLegs().get(0).getStart_location().getLng());
                          mMap.addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromBitmap(myicon)).title(pickPlace));

                         LatLng latLng1 = new LatLng(routesBeans.get(0).getLegs().get(0).getEnd_location()
                                 .getLat(), routesBeans.get(0).getLegs().get(0).getEnd_location().getLng());
                         mMap.addMarker(new MarkerOptions().position(latLng1).title(going));
                       //  mMap.addPolyline(new PolylineOptions().add(latLng).add(latLng1));
                         List<LatLng> latLngs = PolyUtil.decode(modelGsonData.getRoutes().get(0).getOverview_polyline().getPoints());
                         mMap.addPolyline(new PolylineOptions().addAll(latLngs));
                         mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,10.2f));
                         mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));

                     }

                     @Override
                     public void onError(ANError anError) {

                     }
                 });

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(Model model)   {    // Toast.makeText(this, ""+event, Toast.LENGTH_SHORT).show();
        // textView.setText(""+event
        //  Log.d("********",""+event);
      //  JsonObject jsonObject=new JsonObject();
        name.setText("" + model.getName());
        place1.setText(""+model.getPickupPlace());
        place2.setText(""+model.getGoingon());
        message.setText(""+model.getMsg());

        pickPlace = model.getPickupPlace();
        going = model.getGoingon();


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            new AlertDialog.Builder(MapsActivity.this)
                    .setMessage("Acccess the phone location")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ActivityCompat.requestPermissions(MapsActivity.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION
                                    , Manifest.permission.ACCESS_COARSE_LOCATION}, 0);
                        }
                    })
                    .setNegativeButton("Cancle", null)
                    .create()
                    .show();
            // Add a marker in Sydney and move the camera
//            LatLng sydney = new LatLng(-34, 151);
//            mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        }
    }
}