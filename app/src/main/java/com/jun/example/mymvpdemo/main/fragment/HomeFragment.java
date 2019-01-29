package com.jun.example.mymvpdemo.main.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.jun.example.mymvpdemo.R;
import com.jun.example.mymvpdemo.main.model.MainPageResult;
import com.jun.example.mymvpdemo.main.presenter.impl.HomeFragmentPersenterImpl;
import com.jun.example.mymvpdemo.main.view.HomeFragmentView;
import com.jun.example.mymvpdemo.widget.LoadDialog;

public class HomeFragment extends Fragment implements HomeFragmentView {
    HomeFragmentPersenterImpl homeFragmentPersenter;
    private View view;
    private TextView tvText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        initView();
        homeFragmentPersenter = new HomeFragmentPersenterImpl();
        homeFragmentPersenter.attachView(this);
        homeFragmentPersenter.getMainPageResult();
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        homeFragmentPersenter.detachView();
    }

    @Override
    public void mainSuccess(MainPageResult mainPageResult) {
        tvText.setText(JSON.toJSONString(mainPageResult) + "");
    }

    @Override
    public void mainError(String msg) {
        tvText.setText("加载失败");
    }

    @Override
    public void showLoading() {
        LoadDialog.getInstance().showProcessDialog(getContext(),"加载数据中...");
    }

    @Override
    public void hideLoading() {
        LoadDialog.getInstance().cancleShow();
    }

    private void initView() {
        tvText = (TextView) view.findViewById(R.id.tv_text);
    }
}
