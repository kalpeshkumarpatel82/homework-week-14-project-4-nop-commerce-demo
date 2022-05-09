package com.nopcommerce.demo.Pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopPage extends Utility {

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement pageHeader;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement productOrderBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement productDisplayBy;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourComputer;

    public String getPageHeader() {
        Reporter.log("Getting Page Header : " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void setProductOrderBy(String text) {
        Reporter.log("Clicking on Product Order by : "+text+ "to " +productOrderBy.toString());
        selectByVisibleTextFromDropDown(productOrderBy, text);
    }

    public void setProductDisplayBy(String text) {
        Reporter.log("Clicking on Product Display by : "+text+ "to " +productDisplayBy.toString());
        selectByVisibleTextFromDropDown(productDisplayBy, text);
    }

    public void setListView(String text) {
        Reporter.log("Clicking on List View : " + listView.toString());
        clickOnElement(listView);
    }
    public void setBuildYourComputer() {
        Reporter.log("Clicking on Build Your Computer : " + buildYourComputer.toString());
        clickOnElement(buildYourComputer);
    }


}
