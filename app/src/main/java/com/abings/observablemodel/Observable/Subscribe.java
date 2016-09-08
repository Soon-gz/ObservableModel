package com.abings.observablemodel.Observable;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public abstract class Subscribe {
    public  String state = "没在工作！";
    public abstract void update1();
    public abstract void update2();
    public abstract void setState(String state);
    public abstract String showState();
}
