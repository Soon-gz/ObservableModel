package com.abings.observablemodel.Observable;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class Observabler extends Observable {
    @Override
    public void notifypeople() {
        for (Subscribe subscribe: users) {
            subscribe.setState("认真工作！");
            subscribe.update1();
            Log.i("Tag", subscribe.showState());
        }
    }

    @Override
    public void subscribeOn(Subscribe subscribe) {
        users.add(subscribe);
    }

    @Override
    public void setState(String state) {
        this.state = state;
        if (!"老板不在！".equals(state)){
            notifypeople();
        }
    }
}
