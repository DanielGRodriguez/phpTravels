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

        Assert.assertTrue(settingsPage.getChangesSavedText());
    }

    @Test
    public void testUnpaidBookingsMenu() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        BookingsMenu bookingsMenu = dashboardPage.getNavigationBar().openBookingsPage().getBookingsMenu();
        BookingsPage bookingsPage = bookingsMenu.clickUnpaidBookings();
        Table table = bookingsPage.getBookingsTable();
        for(int i = 0; i < table.getRowsCount(); i++) {
            String bookingStatus = table.getChosenPaidStatus(Integer.toString(i)).toUpperCase();
            Assert.assertEquals(bookingStatus, "UNPAID");
        }
    }

    @Test
    public void testDeleteBooking() {
        login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        BookingsPage bookingsPage = dashboardPage.getNavigationBar()
                .openBookingsPage()
                .getBookingsMenu()
                .clickUnpaidBookings();
        Table tableChosen = bookingsPage.getBookingsTable();
        tableChosen.deleteBooking("1");
        getDriver().switchTo().alert().accept();
        Assert.assertFalse(tableChosen.isBookingIdExist("1"), "Element does not exist");
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
