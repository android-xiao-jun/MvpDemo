package com.jun.example.mymvpdemo.login_reg.view;

import com.jun.example.mymvpdemo.base.view.BaseView;
import com.jun.example.mymvpdemo.login_reg.model.LoginResult;

public interface LoginView extends BaseView {
    void loginSuccess(LoginResult loginResult);
    void loginError(String msg);
}
