package com.jun.example.mymvpdemo.main.model;

import com.alibaba.fastjson.JSON;
import com.jun.example.mymvpdemo.base.HttpCofig;
import com.jun.example.mymvpdemo.utils.FastJsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil_Main_etc {

    private static RetrofitUtil_Main_etc mRUtils;
    public final String BASE_URL = HttpCofig.URL_HOME_DEBUG;
    private Retrofit mRetrofit;
    private RetrofitApi_Main_etc maretrofitApi;

    private static final OkHttpClient client = new OkHttpClient.Builder().
            connectTimeout(60, TimeUnit.SECONDS).
            readTimeout(60, TimeUnit.SECONDS).
            writeTimeout(60, TimeUnit.SECONDS).build();

    public static synchronized RetrofitUtil_Main_etc getInstance() {

        if (mRUtils == null) {
            mRUtils = new RetrofitUtil_Main_etc();
        }
        return mRUtils;
    }

    private RetrofitUtil_Main_etc() {

        if (mRetrofit == null) {
            mRetrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(FastJsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }

    }


    public RetrofitApi_Main_etc getRetrofitApi() {

        if (maretrofitApi == null) {
            maretrofitApi = mRetrofit.create(RetrofitApi_Main_etc.class);
        }
        return maretrofitApi;
    }


    public String convert(ResponseBody value) throws IOException {
        BufferedSource bufferedSource = Okio.buffer(value.source());
        String tempStr = bufferedSource.readUtf8();
        bufferedSource.close();
        return JSON.parseObject(tempStr, String.class);
    }

}

