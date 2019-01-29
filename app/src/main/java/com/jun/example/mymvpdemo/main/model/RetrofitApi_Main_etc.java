package com.jun.example.mymvpdemo.main.model;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface RetrofitApi_Main_etc {

    //首页
    @GET("url")
    Observable<String> mainPage();
}
