package com.qaprosoft.carina.demo.phpTravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.demo.phpTravels.components.*;
import com.qaprosoft.carina.demo.phpTravels.pages.BookingsPage;
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
        loginPage.open();
        loginPage.clickForgotAcc();
        loginPage.typeResetEmail("user@jstravels.org");
        loginPage.clickResetButton();
        Assert.assertEquals(loginPage.getEmailNotFoundText(), "Email Not Found");
    }

    @Test
    public void testLoginAdminAcc() {
        loginIn("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isPageOpened());
    }

    @Test
    public void testChangeName() {
        loginIn("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        LeftMenuBar leftMenu =dashboardPage.getLeftMenuBar();

        SettingsPage settingsPage = leftMenu.openSettingsSubmenu();
        settingsPage.typeNameText("JS Travels");
        settingsPage.clickSaveChangeButton();
        Assert.assertEquals(settingsPage.getChangesSavedText(), "Changes Saved!");
    }

    @Test
    public void testConfirmedBookingsMenu() {
        loginIn("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        NavigationBar navigationBar = dashboardPage.getNavigationBar();

        BookingsPage bookingsPage = navigationBar.openBookingsPage();
        BookingsMenu bookingsMenu = bookingsPage.getBookingsButtons();
        bookingsMenu.clickConfirmedBookings();
        Table tableChosen = new Table(getDriver());
        String bookingStatus = tableChosen.getChosenBookingStatus("2");
        Assert.assertEquals(bookingStatus, "Confirmed");
    }

    @Test
    public void testDeleteBooking() {
        loginIn("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        NavigationBar navigationBar = dashboardPage.getNavigationBar();

        BookingsPage bookingsPage = navigationBar.openBookingsPage();
        BookingsMenu bookingsMenu = bookingsPage.getBookingsButtons();
        bookingsMenu.clickConfirmedBookings();
        Table tableChosen = new Table(getDriver());
        tableChosen.deleteBooking("2");
        //Assert
    }

    public void logOutSession() {
        loginIn("admin@phptravels.com", "demoadmin");
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        NavigationBar navigationBar = dashboardPage.getNavigationBar();
        ProfileDropdown profileDropdown = navigationBar.openProfileDropdown();
        profileDropdown.clickLogout();
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened());
    }

    public void loginIn(String email, String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickSubmitButton();
    }
}
