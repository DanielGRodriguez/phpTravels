package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TableRow extends AbstractUIObject {

    @FindBy(xpath = "//td[2]")
    private ExtendedWebElement bookingId;

    @FindBy(xpath = "./td/select[@id='booking_status']")
    private ExtendedWebElement bookingStatusTable;

    @FindBy(xpath = "//select[@id='payment_status']")
    private ExtendedWebElement paymentStatusTable;

    @FindBy(xpath = "//option[text()=\"unpaid\"]")
    private ExtendedWebElement paymentStatusOptions;

    @FindBy(xpath = "./td/a")
    private ExtendedWebElement paymentExecuteTable;

    @FindBy(xpath = "./td/a[@target='_blank']")
    private ExtendedWebElement invoiceOperationButton;

    @FindBy(xpath = "//button[@onclick='del(\"1\" , \"flights\")']")
    private ExtendedWebElement deleteOperationButton;

    public TableRow(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getBookingId() {
        return bookingId.getText();
    }

    public String getBookingStatus() {
        return bookingStatusTable.getText();
    }

    public String getPaymentStatus() {
        paymentStatusTable.click();
        return paymentStatusOptions.getText();
    }

    public void getPaymentExecute() {
        paymentExecuteTable.click();
    }

    public void clickDeleteButton() { deleteOperationButton.click();}

    public void clickInvoiceButton() { invoiceOperationButton.click();}

}
