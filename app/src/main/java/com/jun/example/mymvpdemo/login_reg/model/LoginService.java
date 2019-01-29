package com.jun.example.mymvpdemo.login_reg.model;

import com.jun.example.mymvpdemo.base.HttpCofig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface LoginService {


    //登录  url这里使用的是测试的
    @FormUrlEncoded
    @POST("utl")
    Observable<LoginResult> login(@Field("phone") String phone, @Field("password") String password, @Field("registrationID") String registrationID);
    class Factory {
        public static LoginService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(HttpCofig.URL_HOME_DEBUG)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(LoginService.class);
        }
    }
}
