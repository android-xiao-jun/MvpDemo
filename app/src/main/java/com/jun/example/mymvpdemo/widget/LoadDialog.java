package com.jun.example.mymvpdemo.widget;

import android.app.ProgressDialog;
import android.content.Context;


public class LoadDialog {
    private static LoadDialog loadDialog = null;
    private ProgressDialog progressDialog;

    public static LoadDialog getInstance() {
        if (loadDialog == null) loadDialog = new LoadDialog();
        return loadDialog;
    }

    public void showProcessDialog(Context context,String title) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(context);
            progressDialog.setCancelable(false);

        }
        progressDialog.setTitle(title);
        progressDialog.show();
    }

    public void cancleShow() {

        if (null == progressDialog) {
            return;
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
            progressDialog.cancel();
            progressDialog = null;
        }
    }
}
