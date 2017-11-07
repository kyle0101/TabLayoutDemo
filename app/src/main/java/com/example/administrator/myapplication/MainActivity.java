package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideo;
    private WebView mWebView;
    private TableLayout mTab;
    private TabLayout mTavActiveTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();


    }

    private void initData() {

        for (int i = 0; i < 3; i++) {

            mTavActiveTime.addTab(mTavActiveTime.newTab().setCustomView(R.layout.item_tab));
            ((TextView) mTavActiveTime.getTabAt(i).getCustomView().findViewById(R.id.tv)).setText("10.20");
        }


        mTavActiveTime.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.i("Main", "选中了" + tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.i("Main", "点击了" + tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initView() {
        mTavActiveTime = (TabLayout) findViewById(R.id.tab);
    }


}
