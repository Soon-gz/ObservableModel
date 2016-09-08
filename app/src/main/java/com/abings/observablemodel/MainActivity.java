package com.abings.observablemodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.abings.observablemodel.Observable.Observabler;
import com.abings.observablemodel.Observable.Subscriber1;
import com.abings.observablemodel.Observable.Subscriber2;
import com.abings.observablemodel.Observable.Subscriber3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //前台观察者，随时观察老板的动态,是否来公司了
        Observabler qiantai = new Observabler();

        //看股票和看NBA的同事,订阅者
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        //订阅事件
        qiantai.subscribeOn(subscriber1);
        qiantai.subscribeOn(subscriber2);

        //显示订阅者状态
        Log.i("Tag", "看股票"+subscriber1.showState());
        Log.i("Tag", "看NBA"+subscriber2.showState());

        //老板来了
        qiantai.setState("老板来了！快好好工作！");

        //看杂志同事也订阅了
        Subscriber3 subscriber3 = new Subscriber3();
        qiantai.subscribeOn(subscriber3);

        Log.i("Tag", "==================================");
        //老板又来了
        qiantai.notifypeople();
    }
}
