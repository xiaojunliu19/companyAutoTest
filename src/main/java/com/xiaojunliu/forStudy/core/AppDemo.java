package com.xiaojunliu.forStudy.core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xiaojunliu on 2017/8/2.
 */
public class AppDemo {
    private AndroidDriver androidDriver;
    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.ANDROID);
        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("deviceName","SM-A7108");
        capabilities.setCapability("appPackage","com.sohu.newsclient");
        capabilities.setCapability("appActivity",".boot.activity.SplashActivity");
        capabilities.setCapability("appWaitActivity",".boot.activity.SplashActivity");
        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception{
        androidDriver.quit();
    }
    @Test
    public void test(){
        Delay.delay(10);
        WebElement el = androidDriver.findElementByName("北京");
        el.click();
    }





}
