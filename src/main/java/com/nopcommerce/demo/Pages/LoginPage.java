package com.nopcommerce.demo.Pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//li/a[contains(text(),'Log in')]")
    WebElement loginButtonTopMenu;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement pageHeader;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;

    public void setEmailField(String text) {
        Reporter.log("Sending text to email : " + emailField.toString());
        sendTextToElement(emailField, text);
    }

    public void setPassword(String text) {
        Reporter.log("Sending text to password : " + password.toString());
        sendTextToElement(password, text);
    }

    public void setLoginButton() {
        Reporter.log("clicking on login button : " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getLoginButtonText() {
        Reporter.log("Getting on login button text : " + loginButtonTopMenu.toString());
        return getTextFromElement(loginButtonTopMenu);
    }

    public String getPageHeader() {
        Reporter.log("Getting page header : " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public String getErrorMessage() {
        Reporter.log("Getting Error Message : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String getLogOutButtonText() {
        Reporter.log("Getting LogOut Button Text : " + logOutButton.toString());
        return getTextFromElement(logOutButton);
    }

    public void setLogOutButton() {
        Reporter.log("Clicking on LogOut Button : " + logOutButton.toString());
        clickOnElement(logOutButton);
    }
}