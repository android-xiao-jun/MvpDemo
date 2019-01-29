package com.jun.example.mymvpdemo.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2017/5/17.
 */

public class SPutils {

    public String SP_Name = "appName";  //  sp 文件名


    static SPutils instance;

    public static SPutils getInstance() {
        if (instance == null) instance = new SPutils();
        return instance;
    }

    public void putStringIntoSp(Context context, String key, String str) {
        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        sp.edit().putString(key, str).commit();
    }

    public String getStringFromSp(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        return sp.getString(key, "");

    }


    public void putBooleanIntoSp(Context context, String key, boolean b) {
        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, b).commit();

    }

    public boolean getBooleanFromSp(Context context, String key) {

        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);

        return sp.getBoolean(key, false);

    }


    public void putIntIntoSp(Context context, String key, Integer integer) {

        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        sp.edit().putInt(key, integer).commit();
    }

    public Integer getIntFromSp(Context context, String key) {

        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        return sp.getInt(key, -1);

    }


    public void cleadUserData(Context context) {
        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        //全部清空
        clearAllCache(context);
    }


    public void clearAllCache(Context context) {
        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }


    public void deleteData(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }


}
