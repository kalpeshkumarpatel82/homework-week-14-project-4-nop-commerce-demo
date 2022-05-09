package com.nopcommerce.demo.Pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement pageHeader;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement genderMaleRadio;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//div[@class='date-picker-wrapper']/select[1]")
    WebElement birthDay;

    @FindBy(xpath = "//div[@class='date-picker-wrapper']/select[2]")
    WebElement birthMonth;

    @FindBy(xpath = "//div[@class='date-picker-wrapper']/select[3]")
    WebElement birthYear;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement repeatPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationVerification;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement repeatPasswordError;

    public String getPageHeader() {
        Reporter.log("Getting Page Header : " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void setGenderMaleRadio() {
        Reporter.log("Clicking on Male Gender Radio : " + genderMaleRadio.toString());
        clickOnElement(genderMaleRadio);
    }

    public void setGenderFemaleRadio() {
        Reporter.log("Clicking on Female Gender Radio  : " + genderFemaleRadio.toString());
        clickOnElement(genderFemaleRadio);
    }

    public void setFirstName(String text) {
        Reporter.log("Sending FirstName  : "+text+" to " + firstName.toString());
        sendTextToElement(firstName, text);
    }

    public void setLastName(String text) {
        Reporter.log("Sending text to FirstName : "+text+" to " + lastName.toString());
        sendTextToElement(lastName, text);
    }

    public void setBirthDate(String day, String month, String year) {
        Reporter.log("Selecting BirthDate : " + day + "/" + month + "/" + year + " to " + birthDay.toString() + " " + birthMonth.toString() + " " + birthYear.toString());
        selectByVisibleTextFromDropDown(birthDay, day);
        selectByVisibleTextFromDropDown(birthMonth, month);
        selectByVisibleTextFromDropDown(birthYear, year);
    }

    public void setEmailAddress(String text) {
        Reporter.log("Sending email " + text + " to " + emailAddress.toString());
        int random = (int) (Math.random() * 10000);
        sendTextToElement(emailAddress, text + random + "@domain.co.uk");
    }

    public void setPassword(String text) {
        Reporter.log("Sending Password " + text + " to " + password.toString());
        sendTextToElement(password, text);
    }

    public void setRepeatPassword(String text) {
        Reporter.log("Sending Confirm Password " + text + " to " + repeatPassword.toString());
        sendTextToElement(repeatPassword, text);
    }

    public void setRegisterButton() {
        Reporter.log("Clicking on Register : " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getRegistrationVerification() {
        Reporter.log("Getting Registration confirm : " + registrationVerification.toString());
        return getTextFromElement(registrationVerification);
    }

    public void setContinueButton() {
        Reporter.log("Clicking on continue : " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public String getFirstNameErrorMessage() {
        Reporter.log("Getting FirstName Error : " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String getLastNameErrorMessage() {
        Reporter.log("Getting LastName Error : " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String getEmailErrorMessage() {
        Reporter.log("Getting Email Error : " + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String getPasswordErrorMessage() {
        Reporter.log("Getting Password Error : " + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String getRepeatPasswordErrorMessage() {
        Reporter.log("Getting Repeat Password Error : " + repeatPasswordError.toString());
        return getTextFromElement(repeatPasswordError);
    }

}
