package com.xiaojunliu.forStudy.core;

/**
 * Created by lxj on 2016/12/29.
 */
public class Delay {
    public static void delay(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

