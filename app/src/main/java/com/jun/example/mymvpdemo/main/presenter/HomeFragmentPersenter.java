package com.jun.example.mymvpdemo.main.presenter;

import com.jun.example.mymvpdemo.base.presenter.BasePresenter;
import com.jun.example.mymvpdemo.main.view.HomeFragmentView;

public interface HomeFragmentPersenter extends BasePresenter<HomeFragmentView> {
    void getMainPageResult();
}
