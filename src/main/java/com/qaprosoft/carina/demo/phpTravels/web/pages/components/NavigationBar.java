package com.qaprosoft.carina.demo.phpTravels.web.pages.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.phpTravels.web.pages.BookingsPage;
import com.qaprosoft.carina.demo.phpTravels.web.pages.DashboardPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractUIObject {

    @FindBy(xpath = "//i[normalize-space()='menu']")
    private ExtendedWebElement leftNavMenuButton;

    @FindBy(xpath = "//i[normalize-space()='menu']")
    private LeftMenuBar leftNavMenu;

    @FindBy(xpath = "//div[@class='text-uppercase font-monospace']")
    private ExtendedWebElement dashboardLink;

    @FindBy(xpath = "//a[@class='nav-link' and @xpath=\"1\"]")
    private ExtendedWebElement websiteLink;

    @FindBy(xpath = "//a[@class='nav-link loadeffect']")
    private ExtendedWebElement bookingsLink;

    @FindBy(xpath = "//li[last()]/a[@class='nav-link']")
    private ExtendedWebElement docsLink;

    @FindBy(xpath = "//button[@id='dropdownMenuProfile']")
    private ExtendedWebElement userProfileButton;

    @FindBy(xpath = "//ul[@aria-labelledby = 'dropdownMenuProfile']")
    private ProfileDropdown profileDropdown;

    public NavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ProfileDropdown openProfileDropdown() {
        userProfileButton.click();
        return profileDropdown;
    }

    public LeftMenuBar openLeftMenu() {
        leftNavMenuButton.click();
        return leftNavMenu;
    }

    public DashboardPage openDashboardPage() {
        dashboardLink.click();
        return new DashboardPage(driver);
    }

    public BookingsPage openBookingsPage() {
        bookingsLink.click();
        return new BookingsPage(driver);
    }
}
