package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TableRow extends AbstractUIObject {

    @FindBy(xpath = "//td/select[@id='booking_status']")
    private ExtendedWebElement tableBookingStatus;

    @FindBy(xpath = "//td/select[@id='payment_status']")
    private ExtendedWebElement tablePaymentStatus;

    @FindBy(xpath = "//td/a")
    private ExtendedWebElement tablePaymentExecute;

    @FindBy(xpath = "//td/a[@target='_blank']")
    private ExtendedWebElement buttonInvoice;

    @FindBy(xpath = "//td/button[@class='btn btn-danger mdc-ripple-upgraded']")
    private ExtendedWebElement buttonDeleteOperation;

    public TableRow(WebDriver driver) {
        super(driver);
    }

    public String getBookingStatus() {
        return tableBookingStatus.getText();
    }

    public String getPaymentStatus() {
        return tablePaymentStatus.getText();
    }
}
