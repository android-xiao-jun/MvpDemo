package com.jun.example.mymvpdemo.login_reg.presenter;

import com.jun.example.mymvpdemo.base.presenter.BasePresenter;
import com.jun.example.mymvpdemo.login_reg.view.LoginView;

public interface LoginPresenter extends BasePresenter<LoginView> {
    void login(String username, String pwd, String registrationID);
}
