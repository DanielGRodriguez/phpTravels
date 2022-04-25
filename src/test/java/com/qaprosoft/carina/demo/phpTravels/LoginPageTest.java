package com.qaprosoft.carina.demo.phpTravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.demo.phpTravels.components.*;
import com.qaprosoft.carina.demo.phpTravels.pages.BookingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DashboardPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DropdownNav.SettingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest implements IAbstractTest {

    @Test
    public void testForgotAccButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.open();
        loginPage.clickForgotAcc();
        loginPage.typeResetEmail("user@jstravels.org");
        loginPage.clickResetButton();
        Assert.assertEquals(loginPage.getEmailNotFoundText(), "Email Not Found");
    }

    @Test
    public void testLoginAdminAcc() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isPageOpened());
    }

    @Test
    public void testChangeName() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        SettingsPage settingsPage = dashboardPage.getLeftMenuBar().openSettingsSubmenu();

        settingsPage.typeNameText("JS Travels | Travel Technology Partner");
        settingsPage.clickSaveChangeButton();

        Assert.assertTrue(settingsPage.getChangesSaved());
    }

    @Test
    public void testUnpaidBookingsMenu() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        BookingsMenu bookingsMenu = dashboardPage.getNavigationBar().openBookingsPage().getBookingsMenu();
        BookingsPage bookingsPage = new BookingsPage(getDriver());
        bookingsMenu.clickUnpaidBookings();
        String bookingStatus = bookingsPage.getBookingsTable().getChosenPaidStatus("1").toUpperCase();
        Assert.assertEquals(bookingStatus, "UNPAID");
    }

    @Test
    public void testDeleteBooking() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        NavigationBar navigationBar = dashboardPage.getNavigationBar();

        BookingsPage bookingsPage = navigationBar.openBookingsPage();
        BookingsMenu bookingsMenu = bookingsPage.getBookingsMenu();
        bookingsMenu.clickUnpaidBookings();
        Table tableChosen = bookingsPage.getBookingsTable();
        tableChosen.deleteBooking("1");
        getDriver().switchTo().alert();
        Assert.assertTrue(tableChosen.getBookingIdExist("1"));
    }

    @Test
    public void logOutSession() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.getNavigationBar().openProfileDropdown().clickLogout();
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened());
    }

    public void login() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(R.TESTDATA.get("test_adminAccount"));
        loginPage.typePassword(R.TESTDATA.get("test_adminPassword"));
        loginPage.clickSubmitButton();
    }
}
