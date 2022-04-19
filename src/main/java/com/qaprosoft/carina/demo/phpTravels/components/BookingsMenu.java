package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookingsMenu extends AbstractUIObject{

    @FindBy(xpath = "//div[text() = \"Confrimed Bookings\"]")
    private ExtendedWebElement confirmedButton;

    @FindBy(xpath = "//div[text() = \"Pending Bookings\"]")
    private ExtendedWebElement pendingButton;

    @FindBy(xpath = "//div[text() = \"Cancelled Bookings\"]")
    private ExtendedWebElement cancelButton;

    @FindBy(xpath = "//div[text() = \"Paid Bookings\"]")
    private ExtendedWebElement paidButton;

    @FindBy(xpath = "//div[text() = \"Unpaid Bookings\"]")
    private ExtendedWebElement unpaidButton;

    @FindBy(xpath = "//div[text() = \"Refunded Bookings\"]")
    private ExtendedWebElement refundedButton;

    public BookingsMenu(WebDriver driver) {
        super(driver);
    }

    public Table getTablesConfirmed() {
        confirmedButton.click();
        return new Table(driver);
    }
}
