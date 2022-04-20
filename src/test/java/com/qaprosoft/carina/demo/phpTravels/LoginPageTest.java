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
    LoginPage loginPage = null;
    DashboardPage dashPage = null;

    @BeforeSuite
    public void test() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testOpenPage() {
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
    }

    @Test(dependsOnMethods = "testOpenPage")
    public void testForgotAccButton() {
        loginPage.clickForgotAcc();
        loginPage.typeResetEmail("noadmin@jstravels.org");
        loginPage.clickResetButton();
    }

    @Test(dependsOnMethods = "testOpenPage")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testLoginAdminAcc() {
        loginPage.typeEmail("admin@phptravels.com");
        loginPage.typePassword("demoadmin");
        loginPage.clickSubmitButton();
        Assert.assertTrue(dashPage.isPageOpened());
        dashPage = new DashboardPage(getDriver());
        dashPage.open();
        Assert.assertTrue(dashPage.isPageOpened(), "Dashboard Page is not opened");
    }

    @Test(dependsOnMethods = "testLoginAdminAcc")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testChangeName() {
        dashPage.open();
        LeftMenuBar menuBar = dashPage.getLeftMenuBar();
        Assert.assertTrue(dashPage.isUIObjectPresent(2), "Left Menu Bar menu wasn't found!");
        menuBar.openSettingsSubmenu();

        SettingsPage settingsPage = new SettingsPage(getDriver());
        settingsPage.typeNameText("JS Travels");
        settingsPage.clickSaveChangeButton();
    }
}
