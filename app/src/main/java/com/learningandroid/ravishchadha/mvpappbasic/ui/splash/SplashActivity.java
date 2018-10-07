package com.learningandroid.ravishchadha.mvpappbasic.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.learningandroid.ravishchadha.mvpappbasic.R;
import com.learningandroid.ravishchadha.mvpappbasic.data.DataManager;
import com.learningandroid.ravishchadha.mvpappbasic.MvpApp;
import com.learningandroid.ravishchadha.mvpappbasic.ui.login.LoginActivity;
import com.learningandroid.ravishchadha.mvpappbasic.ui.main.MainActivity;
import com.learningandroid.ravishchadha.mvpappbasic.ui.base.BaseActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
