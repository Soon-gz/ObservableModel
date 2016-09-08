package com.abings.observablemodel.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public abstract class Observable {
    public List<Subscribe>users = new ArrayList<>();
    public String state = "老板不在！";
    public abstract void notifypeople();
    public abstract void subscribeOn(Subscribe subscribe);
    public abstract void setState(String state);
}
