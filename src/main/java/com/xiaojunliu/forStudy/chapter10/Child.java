package com.xiaojunliu.forStudy.chapter10;

/**
 * Created by xiaojunliu on 2017/8/2.
 */
public class Child extends Father {
    public Child(){
        super();
        super.test();
        System.out.println("子类构造方法");
    }

    public void childMethod(){
        System.out.println("子类方法");
    }
}
