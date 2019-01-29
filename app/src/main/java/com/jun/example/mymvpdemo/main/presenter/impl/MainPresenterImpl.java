package com.jun.example.mymvpdemo.main.presenter.impl;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.jun.example.mymvpdemo.R;
import com.jun.example.mymvpdemo.main.fragment.HomeFragment;
import com.jun.example.mymvpdemo.main.model.TabEntity;
import com.jun.example.mymvpdemo.main.presenter.MainPresenter;
import com.jun.example.mymvpdemo.main.view.MainView;

import java.util.ArrayList;

public class MainPresenterImpl implements MainPresenter {

    private MainView view = null;
    private String[] mTitles = {"首页", "地图"};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private int[] mIconUnselectIds = {
            R.drawable.home_my_icon,
            R.drawable.home_map_icon,};
    private int[] mIconSelectIds = {
            R.drawable.home_my_select_icon,
            R.drawable.home_mail_select_icon,};

    private FragmentManager fragmentManager;
    private ArrayList<Fragment> fragments;
    int position = 0;
    private Fragment currFragment;

    @Override
    public void attachView(MainView view) {
        this.view = view;
        view.showLoading();
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void tabFragments(int index) {
        position = index;
        //打开管理事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        Fragment nextFragment = fragments.get(index);

        if (nextFragment != currFragment) {

            if (!nextFragment.isAdded()) {

                if (currFragment != null) {

                    transaction.hide(currFragment);
                }
                transaction.add(R.id.fl_activity_main_content, nextFragment);
            } else {

                if (currFragment != null) {
                    transaction.hide(currFragment);
                }
                transaction.show(nextFragment);
            }
            currFragment = nextFragment;
        }

        //切换fragment
        transaction.commit();
    }


    @Override
    public void initFragment(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
    }

    @Override
    public void initPageView(CommonTabLayout tabLayout) {
        mTabEntities.clear();
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity((mTitles[i]), mIconSelectIds[i], mIconUnselectIds[i]));
        }
        tabLayout.setTabData(mTabEntities);
        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                tabFragments(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        tabFragments(0);
        view.hideLoading();
    }
}
