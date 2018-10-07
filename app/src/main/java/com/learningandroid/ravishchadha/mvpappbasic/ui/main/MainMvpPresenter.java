package com.learningandroid.ravishchadha.mvpappbasic.ui.main;

import com.learningandroid.ravishchadha.mvpappbasic.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}