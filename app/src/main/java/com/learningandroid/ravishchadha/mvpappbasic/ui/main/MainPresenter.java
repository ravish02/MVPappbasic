package com.learningandroid.ravishchadha.mvpappbasic.ui.main;

import com.learningandroid.ravishchadha.mvpappbasic.data.DataManager;
import com.learningandroid.ravishchadha.mvpappbasic.ui.base.BasePresenter;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}