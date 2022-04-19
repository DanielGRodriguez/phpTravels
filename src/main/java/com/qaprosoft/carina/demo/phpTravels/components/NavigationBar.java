package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.phpTravels.pages.BookingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractUIObject {

    @FindBy(xpath = "//i[normalize-space()='menu']")
    private ExtendedWebElement leftNavMenu;

    @FindBy(xpath = "//div[@class='text-uppercase font-monospace']")
    private ExtendedWebElement dashboardLink;

    @FindBy(xpath = "//a[@class='nav-link' and @xpath=\"1\"]")
    private ExtendedWebElement websiteLink;

    @FindBy(xpath = "//a[@class='nav-link loadeffect']")
    private ExtendedWebElement bookingsLink;

    @FindBy(xpath = "//li[last()]/a[@class='nav-link']")
    private ExtendedWebElement docsLink;

    @FindBy(xpath = "//button[@id='dropdownMenuProfile']")
    private ProfileDropdown userProfile;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public LeftMenuBar openLeftMenu() {
        leftNavMenu.click();
        return new LeftMenuBar(driver);
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
