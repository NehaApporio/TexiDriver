package com.example.mmcomp.texidriver;

import android.util.Log;

import com.google.gson.JsonSyntaxException;
import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationReceivedResult;

import org.greenrobot.eventbus.EventBus;

public class NoitificationHandler extends NotificationExtenderService {
    private String TAG="One signal";
    private int NOTIFICATION_BYPASS_TIME = 60;
    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult notification) {

        Log.d("" + TAG, "" + notification.payload.additionalData);

        Model model= null;
        try {
            model = Gson.getInstance().fromJson(""+notification.payload.additionalData,Model.class);
            EventBus.getDefault().post(model);
            //   Log.e("Name",""+ model.getName());
            Log.d(""+TAG,""+model.getName());
            Log.d(""+TAG,""+model.getPickupPlace());
            Log.d(""+TAG,""+model.getGoingon());
            Log.d(""+TAG,""+model.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
