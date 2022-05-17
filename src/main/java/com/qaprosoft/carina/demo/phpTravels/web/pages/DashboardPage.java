package com.qaprosoft.carina.demo.phpTravels.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.BookingsMenu;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.LeftMenuBar;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(className = "navbar")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    @FindBy(xpath = "//div[@class='row gx-3']")
    private BookingsMenu buttonsBookings;

    @FindBy(xpath = "//h1[text()=\"Dashboard\"]")
    private ExtendedWebElement dashboardTitle;

    public DashboardPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(dashboardTitle);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public LeftMenuBar getLeftMenuBar() {
        return leftMenuBar;
    }

    public String getMainTitle() {
        return dashboardTitle.getText();
    }
}
