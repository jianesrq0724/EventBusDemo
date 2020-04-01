package com.carl.mvpdemo.module.bus;

import org.greenrobot.eventbus.EventBus;


/**
 * 事件工具类
 *
 * @author carl.shen
 */
public class BusUtil {

    public static void register(Object object) {
        if (!EventBus.getDefault().isRegistered(object)) {
            EventBus.getDefault().register(object);
        }
    }

    public static void unregister(Object object) {
        if (EventBus.getDefault().isRegistered(object)) {
            EventBus.getDefault().unregister(object);
        }
    }

    public static void post(EventBusModel model) {
        if (null == model) {
            return;
        }
        EventBus.getDefault().post(model);
    }

}
