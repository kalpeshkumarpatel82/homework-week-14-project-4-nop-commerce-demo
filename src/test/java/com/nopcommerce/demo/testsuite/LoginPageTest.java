package com.nopcommerce.demo.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.Pages.HomePage;
import com.nopcommerce.demo.Pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.setLoginLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getPageHeader(), "Welcome, Please Sign In!", "Failed to navigate to Login Page");
        softAssert.assertAll();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.setLoginLink();
        loginPage.setEmailField("kpatel@text.be");
        loginPage.setPassword("123456");
        loginPage.setLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found", "Failed to navigate to Login Page");
        softAssert.assertAll();
    }

    @Test(groups = "regression")
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.setLoginLink();
        loginPage.setEmailField("bbc@belg.com");
        loginPage.setPassword("741852");
        loginPage.setLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getLogOutButtonText(), "Log out", "Failed to Login");
        softAssert.assertAll();
    }

    @Test(groups = "regression")
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.setLoginLink();
        loginPage.setEmailField("bbc@belg.com");
        loginPage.setPassword("741852");
        loginPage.setLoginButton();
        loginPage.setLogOutButton();
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(2000);
        softAssert.assertEquals(loginPage.getLoginButtonText(), "Log in", "Failed to LogOut");
        softAssert.assertAll();
    }
}
