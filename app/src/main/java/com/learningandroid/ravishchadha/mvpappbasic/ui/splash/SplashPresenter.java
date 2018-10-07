package com.learningandroid.ravishchadha.mvpappbasic.ui.splash;

import com.learningandroid.ravishchadha.mvpappbasic.data.DataManager;
import com.learningandroid.ravishchadha.mvpappbasic.ui.base.BasePresenter;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}