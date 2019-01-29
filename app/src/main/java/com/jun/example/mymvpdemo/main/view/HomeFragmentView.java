package com.jun.example.mymvpdemo.main.view;

import com.jun.example.mymvpdemo.base.view.BaseView;
import com.jun.example.mymvpdemo.main.model.MainPageResult;

public interface HomeFragmentView extends BaseView {
    void mainSuccess(MainPageResult mainPageResult);
    void mainError(String msg);

}
