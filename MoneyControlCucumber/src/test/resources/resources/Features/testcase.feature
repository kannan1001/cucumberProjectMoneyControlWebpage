@MoneyCtrl
Feature: MoneyCtrlSpecial
Background: user logged in the application
Given the user is in the home page of money controls and get the title of page

@tc_04_PersonalFinance
Scenario: click on PersonalFinance on MoneyCtrl Page

When home page is ready
Then click on PersonalFinance and scroll down to Incometax calculator
Then click on IncomeTax calculator

@tc_01_Specials
Scenario: clicking on Special tab on MoneyCtrl Page

When page is opened
Then move and hover over specials
Then click on grow your business image source and then comeback to original page
Then close app


#@tc_02_English
#Scenario: Hovering over English tab on MoneyCtrl Page
#
#When page is ready
#Then hover on English and click on Gujarati 

#@tc_03_Login
#Scenario Outline: validating login functionality
#
#Then click on login button using "<emailId>" and "<pwd>"
#Then take screenshot
#Then close moneyctrl
#
#Examples:
#|emailId|pwd|
#|trialexperience11@gmail.com|password12|
#|trailexperiece11@gmail.com|Indian1!|

#@table
#Scenario: validating login using data table
#
#When money ctrl page is opened click on login button
#Then user enters details of emailId and password
#|email|password|
#|abc123@yahoo.com|oopIforgot1!|
#|abcd123@gmail.com|Iforgot123!|
##Then close the login frame 
#And close the application


