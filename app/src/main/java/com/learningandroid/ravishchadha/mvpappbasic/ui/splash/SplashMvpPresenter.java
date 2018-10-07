package com.learningandroid.ravishchadha.mvpappbasic.ui.splash;

import com.learningandroid.ravishchadha.mvpappbasic.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}