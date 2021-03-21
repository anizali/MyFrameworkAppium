package com.qa.stepdef;

import com.qa.utils.GlobalParams;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;

public class Hooks {

    public static AndroidDriver driver;

    @Before
    public void initialise() throws MalformedURLException {

        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
        System.out.println("Initialise " + params.getPlatformName() + " " + params.getDeviceName());

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, params.getUdid());
        caps.setCapability("appPackage", "com.samsung.android.calendar");
        caps.setCapability("appActivity", "com.samsung.android.app.calendar.activity.MainActivity");

        URL url = new URL("http://0.0.0.0:4724/wd/hub");

        driver = new AndroidDriver(url, caps);


    }

    @After
    public void quit(Scenario scenario) {

        /*
        if (scenario.isFailed()) {
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }*/
        driver.quit();

        System.out.println("Quit function");
    }
}
