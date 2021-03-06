package com.nopcommerce.demo.Pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')")
    WebElement pageHeader;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement select320GBHDD;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement select400GBHDD;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement selectVistaPremium;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement selectVistaHome;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement selectMSOffice;
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement selectAdobe;
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectTotalCommander;


    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickOnAddToCartButton;

    @FindBy(xpath = "//div/p[@class='content']")
    WebElement infoFromGreenBar;

    public String getPageHeader() {
        Reporter.log("Getting Page Header " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void setSelectProcessor(String text) {
        Reporter.log("Setting Processor " + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, text);
    }

    public void setSelectRam(String text) {
        Reporter.log("Setting RAM " + selectRam.toString());
        selectByVisibleTextFromDropDown(selectRam, text);
    }

    public void setSelectHDD(String text) {
        if (text.contains("320 GB")) {
            Reporter.log("Setting HDD : " + text + "to " + select320GBHDD.toString());
            clickOnElement(select320GBHDD);
        } else if (text.contains("400 GB [+$100.00]")) {
            Reporter.log("Setting HDD : " + text + "to " + select400GBHDD.toString());
            clickOnElement(select400GBHDD);
        }
    }

    public void setSoftware(String text) {
        if (text == "Microsoft Office [+$50.00]") {
            Reporter.log("Setting software : " + text + "to " + selectMSOffice.toString());
            clickOnElement(selectMSOffice);
        }
        if (text == "Acrobat Reader [+$10.00]") {
            Reporter.log("Setting software : " + text + "to " + selectAdobe.toString());
            clickOnElement(selectAdobe);
        }
        if (text == "Total Commander [+$5.00]") {
            Reporter.log("Setting software : " + text + "to " + selectTotalCommander.toString());
            clickOnElement(selectTotalCommander);
        }

    }


    public void setSelectOS(String text) {
        if (text == "Vista Home [+$50.00]") {
            Reporter.log("Setting OS : " + text + "to " + selectVistaHome.toString());
            clickOnElement(selectVistaHome);
        }
        if (text == "Vista Premium [+$60.00]") {
            Reporter.log("Setting HDD : " + text + "to " + selectVistaPremium.toString());
            clickOnElement(selectVistaPremium);
        }
    }

    public void setClickOnAddToCartButton() {
        Reporter.log("Clicking on Add to cart : " + clickOnAddToCartButton.toString());
        clickOnElement(clickOnAddToCartButton);
    }

    public String getInfoFromGreenBar() {
        Reporter.log("Getting Confirm Message After adding to cart : " + infoFromGreenBar.toString());
        return getTextFromElement(infoFromGreenBar);
    }

}
