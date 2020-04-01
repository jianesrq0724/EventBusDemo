package com.carl.mvpdemo.module.home.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.carl.mvpdemo.R;
import com.carl.mvpdemo.module.bus.EventBusModel;
import com.carl.mvpdemo.module.config.Config;
import com.carl.mvpdemo.module.home.bean.SelectSiteBean;
import com.carl.mvpdemo.pub.base.BaseActivity;
import com.carl.mvpdemo.pub.base.BasePresenter;
import com.carl.mvpdemo.pub.utils.RxManage;
import com.carl.mvpdemo.pub.utils.ToastUtils;

/**
 * @author Carl
 * version 1.0
 * @since 2019/1/31
 */
public class MainActivity extends BaseActivity {

    public RxManage mRxManage = new RxManage();


    Button capt_iv;


    @Override
    protected void findView() {
        capt_iv = findViewById(R.id.capt_iv);
    }

    @Override
    protected void initData() {


    }


    @Override
    public void onEventMainThread(EventBusModel model) {
        if (null == model || TextUtils.isEmpty(model.getEventBusAction())) {
            return;
        }

        switch (model.getEventBusAction()) {
            case Config.KEY_ACTION_GET_MSG_COUNT:
                String keyWord = (String) model.getEventBusObject();
                ToastUtils.showShort(keyWord);
                break;
            case Config.KEY_ACTION_FINISH:
                SelectSiteBean selectSiteBean = (SelectSiteBean) model.getEventBusObject();
                ToastUtils.showShort(selectSiteBean.getSiteName());
                break;
            case Config.KEY_ACTION_FINISH2:
                SelectSiteBean selectSiteBean2 = (SelectSiteBean) model.getEventBusObject();
                ToastUtils.showShort(selectSiteBean2.getSiteName() + ",type: " + model.getEventPageType());
                break;
            default:
                break;
        }
    }

    @Override
    protected void initView() {
        mToolbarManager.setToolbarTitle("test");

        capt_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickCaptcha();
            }
        });

    }


    private void onClickCaptcha() {
        SecondActivity.startActivity(this);
    }

    @Override
    public void setOnInteractListener() {

    }


    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRxManage.clear();
    }


}
