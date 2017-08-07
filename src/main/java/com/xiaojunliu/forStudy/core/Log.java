package com.xiaojunliu.forStudy.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xiaojunliu on 2017/8/2.
 */
public class Log {
    public static void logInfo(String text){
        Date nowtime = new Date();
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(time.format(nowtime) + ": " +text);
}}
