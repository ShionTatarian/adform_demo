package com.example.adformsdk_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.adform.sdk.network.entities.AdformEnum;
import com.adform.sdk.pub.views.AdHesion;
import com.adform.sdk.utils.SmartAdSize;

public class MainActivity extends AppCompatActivity {

    private AdHesion adHesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.adHesion = findViewById(R.id.activity_main_adhesion);
        adHesion.setDebugMode(BuildConfig.DEBUG);
        adHesion.setAdPositionType(AdformEnum.AdPositionType.BOTTOM);
        adHesion.setShowCloseButton(true);
        adHesion.setAdSize(new SmartAdSize());
        adHesion.setMasterTagId(111111);
        adHesion.loadAd();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (adHesion != null) {
            adHesion.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (adHesion != null) {
            adHesion.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (adHesion != null) {
            adHesion.destroy();
        }
    }
}
