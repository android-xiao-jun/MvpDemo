package com.jun.example.mymvpdemo.main.presenter;

import android.support.v4.app.FragmentManager;

import com.flyco.tablayout.CommonTabLayout;
import com.jun.example.mymvpdemo.base.presenter.BasePresenter;
import com.jun.example.mymvpdemo.main.view.MainView;

public interface MainPresenter extends BasePresenter<MainView> {
    void tabFragments(int index);

    void initFragment(FragmentManager fragmentManager);

    void initPageView(CommonTabLayout tabLayout);
}
