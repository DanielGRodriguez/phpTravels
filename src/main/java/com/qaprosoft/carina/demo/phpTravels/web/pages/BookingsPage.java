package com.qaprosoft.carina.demo.phpTravels.web.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phpTravels.components.*;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.BookingsMenu;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.LeftMenuBar;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.NavigationBar;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.Table;
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

    public Table getBookingsTable() {
        return bookingsTable;
    }

    public BookingsMenu getBookingsMenu() {
        return bookingsMenuButtons;
    }
}
