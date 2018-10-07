package com.learningandroid.ravishchadha.mvpappbasic;

import android.app.Application;

import com.learningandroid.ravishchadha.mvpappbasic.data.DataManager;
import com.learningandroid.ravishchadha.mvpappbasic.data.SharedPrefsHelper;

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}