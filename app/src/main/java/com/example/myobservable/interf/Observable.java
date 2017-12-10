package com.example.myobservable.interf;

/**
 * Created by Administrator on 2017/12/10.
 */

public interface Observable {
    void register(Observe observe);
    void unRegister(Observe observe);
    void notify(String msg);
}
