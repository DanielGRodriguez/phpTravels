package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TableRow extends AbstractUIObject {

    @FindBy(xpath = "")
    private ExtendedWebElement bookingId;

    @FindBy(xpath = "//td/select[@id='booking_status']")
    private ExtendedWebElement bookingStatusTable;

    @FindBy(xpath = "//td/select[@id='payment_status']")
    private ExtendedWebElement paymentStatusTable;

    @FindBy(xpath = "//td/a")
    private ExtendedWebElement paymentExecuteTable;

    @FindBy(xpath = "//td/a[@target='_blank']")
    private ExtendedWebElement invoiceOperationButton;

    @FindBy(xpath = "//td/button[@class='btn btn-danger mdc-ripple-upgraded']")
    private ExtendedWebElement deleteOperationButton;

    public TableRow(WebDriver driver) {
        super(driver);
    }

    public String getBookingId() {
        return bookingId.getText();
    }

    public String getBookingStatus() {
        return bookingStatusTable.getText();
    }

    public String getPaymentStatus() {
        return paymentStatusTable.getText();
    }

    public void clickDeleteButton() { deleteOperationButton.click();}

    public void clickInvoiceButton() { invoiceOperationButton.click();}

}
