package com.carl.mvpdemo.module.home.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.carl.mvpdemo.R;
import com.carl.mvpdemo.module.bus.BusUtil;
import com.carl.mvpdemo.module.bus.EventBusModel;
import com.carl.mvpdemo.module.config.Config;
import com.carl.mvpdemo.module.home.bean.SelectSiteBean;
import com.carl.mvpdemo.pub.base.BaseActivity;
import com.carl.mvpdemo.pub.base.BasePresenter;

public class SecondActivity extends BaseActivity {

    Button button;
    Button button2;
    Button button3;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), SecondActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void findView() {
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public void setOnInteractListener() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyWord = "send String";
                BusUtil.post(new EventBusModel(Config.KEY_ACTION_GET_MSG_COUNT, keyWord));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectSiteBean selectSiteBean = new SelectSiteBean(1, "send object", 1, "");
                BusUtil.post(new EventBusModel(Config.KEY_ACTION_FINISH, selectSiteBean));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectSiteBean selectSiteBean = new SelectSiteBean(1, "send object and type", 1, "");
                BusUtil.post(new EventBusModel(Config.KEY_ACTION_FINISH2, selectSiteBean, 1));
            }
        });
    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }
}
