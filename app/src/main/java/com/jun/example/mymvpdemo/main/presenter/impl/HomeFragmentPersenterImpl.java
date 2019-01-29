package com.jun.example.mymvpdemo.main.presenter.impl;

import android.util.Log;

import com.jun.example.mymvpdemo.main.model.MainPageResult;
import com.jun.example.mymvpdemo.main.model.MainService;
import com.jun.example.mymvpdemo.main.model.RetrofitUtil_Main_etc;
import com.jun.example.mymvpdemo.main.presenter.HomeFragmentPersenter;
import com.jun.example.mymvpdemo.main.view.HomeFragmentView;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HomeFragmentPersenterImpl implements HomeFragmentPersenter {

    private HomeFragmentView view;
    private String mainPageResult;
    private Subscription subscribe;

    @Override
    public void getMainPageResult() {
        view.showLoading();

        subscribe = RetrofitUtil_Main_etc.getInstance().getRetrofitApi().mainPage()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                        view.hideLoading();
                        //相关数据处理
                        Log.e("String",mainPageResult);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.hideLoading();
                        view.mainError("网络错误");
                    }

                    @Override
                    public void onNext(String result) {
                        mainPageResult = result;
                    }
                });

    }

    @Override
    public void attachView(HomeFragmentView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
        if (subscribe != null) {
            subscribe = null;
        }
    }
}
