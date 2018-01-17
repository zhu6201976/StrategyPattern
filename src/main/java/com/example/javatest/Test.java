package com.example.javatest;

/**
 * 策略模式（Strategy Pattern），定义了一系列的算法，
 * 将每一种算法封装起来并可以相互替换使用，
 * 策略模式让算法独立于使用它的客户应用而独立变化。
 * OO设计原则：
 * 1、面向接口编程（面向抽象编程）
 * 2、封装变化
 * 3、多用组合，少用继承
 */
public class Test {

    public static void main(String[] args) {

        BaseService userService = new UserService();
        userService.setiSave(new FileSave());
        userService.add("test");

    }


}
