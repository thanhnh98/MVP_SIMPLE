package com.thanh.mvp_architecture.presenter.impl;

import android.app.ProgressDialog;
import android.content.Context;

import com.thanh.mvp_architecture.presenter.LoginPresenter;

public class LoginPresenterImpl implements LoginPresenter {
    private final Context context;
    private final View view;
    public LoginPresenterImpl(Context context, View view){

        this.context = context;
        this.view = view;
    }
    @Override
    public void onLogin(String username,String password) {
        view.onLoginPending();
        if(username.equals("1")&&password.equals("1")){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            view.onLoginSuccess();
        }else view.onLoginFail();

    }

}
