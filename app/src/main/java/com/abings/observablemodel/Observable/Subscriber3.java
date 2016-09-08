package com.abings.observablemodel.Observable;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class Subscriber3 extends Subscribe {
    @Override
    public void update1() {
        Log.i("Tag", "观察者提示：老板来了，看杂志的同事关闭杂志，认真工作");
    }

    @Override
    public void update2() {
        Log.i("Tag","观察者提示：老板来了，看杂志的同事关闭杂志，认真工作");
    }

    @Override
    public void setState(String state) {
        this.state = "看杂志同事状态："+state;
    }

    @Override
    public String showState() {
        return state;
    }
}
