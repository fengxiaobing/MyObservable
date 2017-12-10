package com.example.myobservable;

import com.example.myobservable.interf.Observable;
import com.example.myobservable.interf.Observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/10.
 */

public class ObservableImp implements Observable{
    private List<Observe> observes = new ArrayList<>();
    @Override
    public void register(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void unRegister(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void notify(String msg) {
        for (Observe observe:observes ) {
            observe.update("测试");
        }
    }
}
