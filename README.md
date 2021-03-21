This Project is to automate Calendar App using Appium

Appium - Appium is an open source, cross-platform test automation tool for native, hybrid and mobile web and desktop apps, tested on simulators (iOS), emulators (Android), and real devices (iOS, Android, Windows, Mac).


## Project Description:
* Project setup with Appium
* Written in Java with Junit, Cucumber & Maven


## Setup:
* Install [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* Install Maven [Maven](https://maven.apache.org/)
* Install Appium [Appium](https://appium.io/)

## Inspector
Appium Desktop - Appium Server and Inspector in Desktop GUIs for Mac, Windows, and Linux.

## Run tests:
* Run MyRunnerTest class
* Run command 'mvn -Dtest=MyRunnerTest test'



## View HTML Report
* HTML report will be generated once execution finish \target\cucumber-html-reports
* Open overview-features.html

#Test Report screenshots




## Maven Integration test logs :
[BuildSuccess](/assets/BuildSuccess.png)

Scenario Outline: Create a workshop meeting event from nine to one # src/test/resources/Calender.feature:8
Initialise Android Galaxy S10+
Mar 21, 2021 3:53:34 PM io.appium.java_client.remote.AppiumCommandExecutor$1 lambda$0
INFO: Detected dialect: W3C
Launch Calendar App and click on Friday
  Given I have launched the calendar App and it is working friday  # com.qa.stepdef.CalenderSteps.iHaveLaunchedTheCalendarApp()
Working Friday
  And Book a meeting between 930am and 1.30pm                      # com.qa.stepdef.CalenderSteps.bookAMeeting()
Quit function
Mar 21, 2021 3:53:39 PM net.masterthought.cucumber.ReportParser parseJsonFiles
INFO: File '/var/folders/jy/bq4hxkmx61z5zyg4d3j7rz8c0000gp/T/cucumber7772770303628924316.json' contains 1 features
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

1 Scenarios (1 passed)
2 Steps (2 passed)
0m12.961s

