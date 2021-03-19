package com.qa.stepdef;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {



    @Before
    public void initialise() throws MalformedURLException {
        System.out.println("Initialise");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S10+");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "R58M388CESN");
        caps.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
        //caps.setCapability(MobileCapabilityType., "Android");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, caps);


    }

    @After
    public void quit() {
        System.out.println("Quit function");
    }
}
