package com.carl.mvpdemo.module.bus;

import java.io.Serializable;

/**
 * @author carl.shen
 * EventBus传递数据的model
 */
public class EventBusModel implements Serializable {

    private String eventBusAction;
    private Object eventBusObject;
    private int eventPageType;

    public EventBusModel() {
    }

    public EventBusModel(String eventBusAction, Object eventBusObject) {
        this.eventBusAction = eventBusAction;
        this.eventBusObject = eventBusObject;
    }

    public EventBusModel(String eventBusAction, Object eventBusObject, int eventPageType) {
        this.eventBusAction = eventBusAction;
        this.eventBusObject = eventBusObject;
        this.eventPageType = eventPageType;
    }

    public int getEventPageType() {
        return eventPageType;
    }

    public void setEventPageType(int eventPageType) {
        this.eventPageType = eventPageType;
    }

    public String getEventBusAction() {
        return eventBusAction;
    }

    public void setEventBusAction(String eventBusAction) {
        this.eventBusAction = eventBusAction;
    }

    public Object getEventBusObject() {
        return eventBusObject;
    }

    public void setEventBusObject(Object eventBusObject) {
        this.eventBusObject = eventBusObject;
    }


    @Override
    public String toString() {
        return "EventBusModel{" +
                "eventBusAction='" + eventBusAction + '\'' +
                ", eventBusObject=" + eventBusObject + '\'' +
                ", eventPageType=" + eventPageType +
                '}';
    }
}
