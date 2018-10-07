package com.learningandroid.ravishchadha.mvpappbasic.ui.login;

import com.learningandroid.ravishchadha.mvpappbasic.ui.base.MvpPresenter;
import com.learningandroid.ravishchadha.mvpappbasic.ui.login.LoginMvpView;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}