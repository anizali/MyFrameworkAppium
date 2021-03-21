package com.qa.pages;

import com.qa.stepdef.Hooks;
import org.openqa.selenium.By;

public class CalendarPage extends Hooks {

    public static String dayInMonth;

    public static By monthView = By.xpath("//*[contains(@resource-id,'month_day_of_week_view')]");

    public static By workingFriday = By.xpath("//*[contains(@resource-id,'month_view_pager')]//*[27]");

    public static By title = By.id("com.samsung.android.calendar:id/title");

    public static By startTime = By.id("com.samsung.android.calendar:id/start_date_time");

    public static By endTime = By.id("com.samsung.android.calendar:id/end_date_time");


}
