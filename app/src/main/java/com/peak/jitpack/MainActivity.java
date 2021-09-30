package com.peak.jitpack;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.peak.toast.ToastUtil;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String APP_PACKAGE = "peak.chao.root";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queryAppList();
        ToastUtil.show(this, "启动成功!");
    }


    public void queryAppList() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        // 桌面启动属性
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        // 使用 queryIntentActivities 获取应用名称和包名
        List<ResolveInfo> mResolveInfos = getPackageManager().queryIntentActivities(intent, PackageManager.MATCH_ALL);
        if (mResolveInfos == null || mResolveInfos.isEmpty()) {
            return;
        }
        for (ResolveInfo info : mResolveInfos) {
            // 获取应用名称
            // 获取应用包名
            Log.e("-->", "AppInfo :" + info.activityInfo.applicationInfo.loadLabel(getPackageManager()).toString() + "-->" + info.activityInfo.packageName);
        }
    }

    //打开应用商店
    private void openMarket() {
        try {
            Uri uri = Uri.parse("market://details?id=" + APP_PACKAGE);//id为包名
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(it);
        } catch (Exception e) {
            //打开应用商店失败 可能是手机没有安装应用市场
            //调用系统浏览器进入服务器的安装链接
            String url = "http://a.app.qq.com/o/simple.jsppkgname=" + APP_PACKAGE;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    }
}