package com.solvd.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.phpTravels.pages.BookingsPage;
import com.solvd.phpTravels.pages.DashboardPage;
import com.solvd.phpTravels.pages.DocsPage;
import com.solvd.phpTravels.pages.WebsitePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractUIObject {
    @FindBy(xpath = "//*[@id=\"drawerToggle\"]")
    private ExtendedWebElement leftNavMenu;

    @FindBy(xpath = "/html/body/nav/div/a")
    private ExtendedWebElement dashboardLink;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[1]")
    private ExtendedWebElement websiteLink;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[2]")
    private ExtendedWebElement bookingsLink;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[3]")
    private ExtendedWebElement docsLink;

    @FindBy(xpath = "/html/body/nav/div/div/div")
    private ExtendedWebElement userProfile;

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

    public WebsitePage openWebsitePage() {
        websiteLink.click();
        return new WebsitePage(driver);
    }

    public BookingsPage openBookingsPage() {
        bookingsLink.click();
        return new BookingsPage(driver);
    }

    public DocsPage openDocsPage() {
        docsLink.click();
        return new DocsPage(driver);
    }
}
