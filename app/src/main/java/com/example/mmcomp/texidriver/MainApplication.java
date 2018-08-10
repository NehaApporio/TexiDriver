package com.example.mmcomp.texidriver;

import android.app.Application;

import com.onesignal.OneSignal;

public class MainApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();


        OneSignal.startInit(this)
                .autoPromptLocation(true)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();


    }
}
