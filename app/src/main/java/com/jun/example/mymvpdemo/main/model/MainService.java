package com.jun.example.mymvpdemo.main.model;

import com.jun.example.mymvpdemo.base.HttpCofig;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface MainService {

//    @GET("users/{username}/repos")
//    Observable<List<Repository>> publicRepositories(@Path("username") String username);
//
//    @GET
//    Observable<List<Repo>> javaRepositories(@Url String javaUrl) ;

    //首页
    @FormUrlEncoded
    @POST("index/ZsfdIndexController/queryIndex.json")
    Observable<MainPageResult> mainPage(@Field("currentUserId") String currentUserId, @Field("token") String token);
    class Factory {
        public static MainService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(HttpCofig.URL_HOME_DEBUG)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(MainService.class);
        }
    }
}
