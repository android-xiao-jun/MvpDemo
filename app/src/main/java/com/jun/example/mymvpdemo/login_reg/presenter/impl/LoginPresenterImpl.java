package com.jun.example.mymvpdemo.login_reg.presenter.impl;

import com.jun.example.mymvpdemo.login_reg.model.LoginResult;
import com.jun.example.mymvpdemo.login_reg.model.LoginService;
import com.jun.example.mymvpdemo.login_reg.presenter.LoginPresenter;
import com.jun.example.mymvpdemo.login_reg.view.LoginView;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView view;
    private LoginResult loginResult;
    private Subscription subscribe;

    @Override
    public void attachView(LoginView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
        if (subscribe != null) {
            subscribe = null;
        }
    }

    @Override
    public void login(String username, String pwd, String registrationID) {
        view.showLoading();
        subscribe = LoginService.Factory.create()
                .login(username, pwd, registrationID)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<LoginResult>() {
                    @Override
                    public void onCompleted() {
                        view.hideLoading();
                        //登录成功之后
                        view.loginSuccess(loginResult);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.hideLoading();
                        view.loginError("网络错误");
                    }

                    @Override
                    public void onNext(LoginResult result) {
                        loginResult = result;
                    }
                });
    }

}
