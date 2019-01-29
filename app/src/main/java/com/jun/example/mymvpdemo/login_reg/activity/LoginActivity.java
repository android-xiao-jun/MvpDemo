package com.jun.example.mymvpdemo.login_reg.activity;

import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jun.example.mymvpdemo.R;
import com.jun.example.mymvpdemo.base.BaseActivity;
import com.jun.example.mymvpdemo.login_reg.model.LoginResult;
import com.jun.example.mymvpdemo.login_reg.presenter.impl.LoginPresenterImpl;
import com.jun.example.mymvpdemo.login_reg.view.LoginView;
import com.jun.example.mymvpdemo.main.activity.MainActivity;
import com.jun.example.mymvpdemo.widget.LoadDialog;

public class LoginActivity extends BaseActivity implements LoginView, View.OnClickListener {

    private static final String TAG = "LoginActivity";
    private LoginPresenterImpl presenter;
    private EditText etPhone;
    private EditText etPwd;
    private Button btnLogin;

    @Override
    protected void initView() {
        presenter = new LoginPresenterImpl();
        presenter.attachView(this);
        etPhone = (EditText) findViewById(R.id.et_phone);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_login;
    }


    @Override
    public void loginSuccess(LoginResult loginResult) {
        showToastShort("登录成功");
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void loginError(String msg) {
        showToastShort(msg);
        //这里肯定登录不好使，所有强行跳转首页
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void showLoading() {
        LoadDialog.getInstance().showProcessDialog(this, "登录中...");
    }

    @Override
    public void hideLoading() {
        LoadDialog.getInstance().cancleShow();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                if (etPhone.getText() == null || etPhone.getText().toString().isEmpty()) {
                    showToastShort("请输入手机号");
                    return;
                }

                if (etPwd.getText() == null || etPwd.getText().toString().isEmpty()) {
                    showToastShort("请输入密码");
                    return;
                }
                presenter.login(etPhone.getText().toString(), etPwd.getText().toString(), "");
                break;
            default:
                break;
        }
    }
}
