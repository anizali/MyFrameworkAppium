package com.qa.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CalenderSteps {
    @Given("^I have launched the calendar App$")
    public void iHaveLaunchedTheCalendarApp() {

        System.out.println("Launch Calendar App");
    }

    @When("^It is a working Friday$")
    public void itIsAWorkingFriday() {

        System.out.println("Working Friday");
    }
}
