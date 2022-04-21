package com.qaprosoft.carina.demo.phpTravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.demo.phpTravels.components.LeftMenuBar;
import com.qaprosoft.carina.demo.phpTravels.pages.DashboardPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DropdownNav.SettingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.LoginPage;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPageTest implements IAbstractTest {

    @Test
    public void testForgotAccButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.clickForgotAcc();
        loginPage.typeResetEmail("noadmin@jstravels.org");
        loginPage.clickResetButton();
        Assert.assertEquals(loginPage.getEmailNotFoundText(), "Email Not Found");
    }

    @Test() //547c77e
    public void testLoginAdminAcc() {
        login("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isUIObjectPresent());
    }

    @Test()
    public void testChangeName() {
        login("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        LeftMenuBar leftMenu =dashboardPage.getLeftMenuBar();
        leftMenu.openSettingsSubmenu();
        SettingsPage settingsPage = new SettingsPage(getDriver());
        settingsPage.typeNameText("JS Travels");
        settingsPage.clickSaveChangeButton();
        Assert.assertEquals(settingsPage.getChangesSavedText(), "Changes Saved!");
    }

    public void login(String email, String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickSubmitButton();
    }
}
