package com.qa.stepdef;

import com.qa.actions.CalendarActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CalenderSteps {
    @Given("^I have launched the calendar App and it is working friday$")
    public void iHaveLaunchedTheCalendarApp() {

        CalendarActions.selectDate();
        System.out.println("Launch Calendar App and click on Friday");
    }

    @When("^Book a meeting between 930am and 1.30pm$")
    public void bookAMeeting() {

        CalendarActions.bookMeeting();

        System.out.println("Working Friday");
    }
}
