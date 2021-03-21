package com.qa.actions;

import com.qa.pages.CalendarPage;
import com.qa.stepdef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CalendarActions extends Hooks{


    public static void launchApp() {

    }

    public static void selectDate() {
        click(CalendarPage.workingFriday);

    }

    public static void bookMeeting() {
        click(CalendarPage.workingFriday);
        sendKeys(CalendarPage.title, "Workshop");
        /*Select datepickerStart = new Select(driver.findElement(CalendarPage.startTime));
        datepickerStart.selectByVisibleText("Fri, 26 Mar. 9:30 am");
        Select datepickerEnd = new Select(driver.findElement(CalendarPage.startTime));
        datepickerEnd.selectByVisibleText("Fri, 26 Mar. 1:30 pm");*/

    }


    public static void click(By element) {
        driver.findElement(element).click();
    }

    public static void sendKeys(By element, String value) {
        driver.findElement(element).sendKeys(value);
    }
}
