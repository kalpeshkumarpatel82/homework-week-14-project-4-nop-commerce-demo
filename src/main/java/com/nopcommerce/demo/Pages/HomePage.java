package com.nopcommerce.demo.Pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computerLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement apparelLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement ddLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement jewerlyrLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement gcLink;

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement myAccount;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;


    public void setComputerLink() {
        Reporter.log("Clicking on Computer Link : " + computerLink.toString());
        clickOnElement(computerLink);
    }

    public void setElectronicsLink() {
        Reporter.log("Clicking on Electronics Link : " + electronicsLink.toString());
        clickOnElement(electronicsLink);
    }

    public void setApparelLink() {
        Reporter.log("Clicking on Appareal Link : " + apparelLink.toString());
        clickOnElement(apparelLink);
    }

    public void setDdLink() {
        Reporter.log("Clicking on Digital Download Link : " + ddLink.toString());
        clickOnElement(ddLink);
    }

    public void setBooksLink() {
        Reporter.log("Clicking on Books Link : " + booksLink.toString());
        clickOnElement(booksLink);
    }

    public void setJewerlyrLink() {
        Reporter.log("Clicking on Jewerly Link : " + jewerlyrLink.toString());
        clickOnElement(jewerlyrLink);
    }

    public void setGCLink() {
        Reporter.log("Clicking on Gift Card Link : " + gcLink.toString());
        clickOnElement(gcLink);
    }

    public void setLoginLink() {
        Reporter.log("Clicking on login Link : " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void setRegisterLink() {
        Reporter.log("Clicking on Register Link : " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void setLogo() {
        Reporter.log("Clicking on Logo Link : " + logo.toString());
        clickOnElement(logo);
    }

    public void setMyAccount() {
        Reporter.log("Clicking on MyAccount Link : " + myAccount.toString());
        clickOnElement(myAccount);
    }

    public void setLogOutLink() {
        Reporter.log("Clicking on logout Link : " + logOutLink.toString());
        clickOnElement(logOutLink);
    }


}
