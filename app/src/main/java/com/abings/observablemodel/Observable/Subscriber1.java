package com.abings.observablemodel.Observable;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class Subscriber1 extends Subscribe {
    @Override
    public void update1() {
        Log.i("Tag", "观察者提示：老板来了，看股票的同事关闭股票，认真工作");
    }

    @Override
    public void update2() {
        Log.i("Tag","观察者提示：老板来了，看股票的同事关闭股票，认真工作");
    }

    @Override
    public void setState(String state) {
        this.state = "看股票同事状态："+state;
    }

    @Override
    public String showState() {
        return state;
    }
}
