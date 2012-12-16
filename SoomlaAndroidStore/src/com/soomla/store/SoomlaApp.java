package com.soomla.store;

import android.app.Application;
import android.content.Context;

public class SoomlaApp extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getAppContext() {
        return context;
    }
}