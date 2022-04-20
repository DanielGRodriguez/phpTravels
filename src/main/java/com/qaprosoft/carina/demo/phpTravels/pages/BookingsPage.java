package com.qaprosoft.carina.demo.phpTravels.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phpTravels.components.BookingsMenu;
import com.qaprosoft.carina.demo.phpTravels.components.LeftMenuBar;
import com.qaprosoft.carina.demo.phpTravels.components.NavigationBar;
import com.qaprosoft.carina.demo.phpTravels.components.Table;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingsPage extends AbstractPage {

    @FindBy(xpath = "//nav[@class]")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    @FindBy(xpath = "//div[@class='row gx-3']")
    private BookingsMenu bookingsMenuButtons;

    @FindBy(xpath = "//tbody")
    private Table bookingsTable;

    public BookingsPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public Table getBookingsTable() { return bookingsTable; }

}
