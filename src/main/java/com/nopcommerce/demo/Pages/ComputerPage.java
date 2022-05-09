package com.nopcommerce.demo.Pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Desktops')]")
    WebElement desktopLink;

    @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Notebooks')]")
    WebElement noteBooksLink;

    @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Software')]")
    WebElement softwareLink;

    public String getPageHeader() {
        Reporter.log("Getting Page Header " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void setDesktopLink() {
        Reporter.log("Clicking on Desktop Link " + desktopLink.toString());
        clickOnElement(desktopLink);
    }

    public void setNotebooksLink() {
        Reporter.log("Clicking on NoteBooks Link " + noteBooksLink.toString());
        clickOnElement(noteBooksLink);
    }

    public void setSoftwareLink() {
        Reporter.log("Clicking on Software Link " + softwareLink.toString());
        clickOnElement(softwareLink);
    }


}
