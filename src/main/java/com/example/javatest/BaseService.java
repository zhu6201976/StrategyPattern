package com.example.javatest;

/**
 * BaseService
 * Created by My on 2018/1/17.
 */

public abstract class BaseService {
    private ISave iSave;

    public void setiSave(ISave iSave) {
        this.iSave = iSave;
    }

    public void add(String data) {
        System.out.println("检查数据的合法性");
        iSave.save(data);
        System.out.println("数据保存完毕");
    }
}
