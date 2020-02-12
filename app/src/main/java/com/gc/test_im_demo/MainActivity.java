package com.gc.test_im_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;

import com.netease.nim.uikit.api.NimUIKit;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.util.NIMUtil;

public class MainActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NIMClient.init(this, null, null);
        if (NIMUtil.isMainProcess(this)) {
            NimUIKit.init(this);
        }
    }
}
