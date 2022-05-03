package com.qaprosoft.carina.demo.phpTravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.demo.phpTravels.components.*;
import com.qaprosoft.carina.demo.phpTravels.pages.BookingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DashboardPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DropdownNav.SettingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.LoginPage;
import com.qaprosoft.carina.demo.utils.AuthenticationUtil;
import com.qaprosoft.carina.demo.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.qaprosoft.carina.demo.utils.AuthenticationUtil.login;


public class LoginPageTest implements IAbstractTest {
    ScreenshotUtil utils = new ScreenshotUtil();

    @Test
    public void testForgotAccButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.open();
        loginPage.clickForgotAcc();
        loginPage.typeResetEmail("user@jstravels.org");
        utils.takeScreenshot("testForgotAccButton");
        pause(3);
        loginPage.clickResetButton();
        Assert.assertEquals(loginPage.getEmailNotFoundText(), "Email Not Found");
    }

    @Test
    public void testLoginAdminAcc() {
        LoginPage loginPage = new LoginPage(getDriver());
        login(loginPage);
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isPageOpened());
    }

    @Test
    public void testChangeName() {
        LoginPage loginPage = new LoginPage(getDriver());
        login(loginPage);
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        SettingsPage settingsPage = dashboardPage.getLeftMenuBar().openSettingsSubmenu();

        settingsPage.typeNameText("JS Travels | Travel Technology Partner");
        utils.takeScreenshot();
        pause(3);
        settingsPage.clickSaveChangeButton();

        Assert.assertTrue(settingsPage.getChangesSavedText());
    }

    @Test
    public void testUnpaidBookingsMenu() {
        LoginPage loginPage = new LoginPage(getDriver());
        login(loginPage);
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        BookingsMenu bookingsMenu = dashboardPage.getNavigationBar().openBookingsPage().getBookingsMenu();
        BookingsPage bookingsPage = bookingsMenu.clickUnpaidBookings();
        Table table = bookingsPage.getBookingsTable();

        String bookingStatus = table.getChosenPaidStatus(Integer.toString(1)).toUpperCase();
        Assert.assertEquals(bookingStatus, "UNPAID");
    }

    @Test
    public void logOutSession() {
        LoginPage loginPage = new LoginPage(getDriver());
        login(loginPage);
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage
                .getNavigationBar()
                .openProfileDropdown()
                .clickLogout();
        loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened());
    }
}
