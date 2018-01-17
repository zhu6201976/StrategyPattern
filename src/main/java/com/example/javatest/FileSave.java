package com.example.javatest;

/**
 * FileSave:策略1：保存到文件中
 * Created by My on 2018/1/17.
 */

public class FileSave implements ISave {
    @Override
    public void save(String data) {
        System.out.println("将数据保存到文件中..."+data);
        }
        }
