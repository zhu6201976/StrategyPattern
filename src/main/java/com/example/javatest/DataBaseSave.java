package com.example.javatest;

/**
 * DataBaseSave:策略3：保存到数据库中
 * Created by My on 2018/1/17.
 */

public class DataBaseSave implements ISave {
    @Override
    public void save(String data) {
        System.out.println("将数据保存到数据库中..." + data);
    }
}
