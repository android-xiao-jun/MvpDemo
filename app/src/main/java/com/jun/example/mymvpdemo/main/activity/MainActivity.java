package com.jun.example.mymvpdemo.main.activity;

import com.flyco.tablayout.CommonTabLayout;
import com.jun.example.mymvpdemo.R;
import com.jun.example.mymvpdemo.base.BaseActivity;
import com.jun.example.mymvpdemo.main.presenter.impl.MainPresenterImpl;
import com.jun.example.mymvpdemo.main.view.MainView;
import com.jun.example.mymvpdemo.widget.LoadDialog;


public class MainActivity extends BaseActivity implements MainView {
    MainPresenterImpl presenter;
    CommonTabLayout tabLayout;


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
    @Override
    protected void initView() {
        presenter=new MainPresenterImpl();
        presenter.attachView(this);
        tabLayout = findViewById(R.id.tablayout);
        presenter.initFragment(getSupportFragmentManager());
        presenter.initPageView(tabLayout);
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    public void showLoading() {
        LoadDialog.getInstance().showProcessDialog(this, "加载中...");
    }

    @Override
    public void hideLoading() {
        LoadDialog.getInstance().cancleShow();
    }
}
