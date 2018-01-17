package com.example.javatest;

/**
 * NetSave:策略2:保存到网络中
 * Created by My on 2018/1/17.
 */

public class NetSave implements ISave {
    @Override
    public void save(String data) {
        System.out.println("将数据保存到网络中..." + data);
    }
}
