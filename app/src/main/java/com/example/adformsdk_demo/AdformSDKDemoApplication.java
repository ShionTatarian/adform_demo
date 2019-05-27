package com.example.adformsdk_demo;

import android.app.Application;

import com.adform.sdk.AdformSDK;
import com.adform.sdk.utils.AdApplicationService;

public class AdformSDKDemoApplication extends Application implements AdApplicationService.ServiceListener {

    private AdApplicationService adService;

    @Override
    public void onCreate() {
        super.onCreate();
        adService = AdApplicationService.init();
        AdformSDK.setHttpsEnabled(true);
        AdformSDK.setOpenAdInInAppBrowser(false);

    }

    @Override
    public AdApplicationService getAdService() {
        return adService;
    }
}
