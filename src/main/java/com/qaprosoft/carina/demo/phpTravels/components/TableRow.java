package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TableRow extends AbstractUIObject {

    @FindBy(xpath = "//td[@class=\"xcrud-current xcrud-num sorting_1\"]")
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

    @FindBy(xpath = "//td/button[@class=\"btn btn-danger mdc-ripple-upgraded\"]")
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

    public void clickDeleteButton() {
        Actions action = new Actions(driver);
        action.moveToElement(deleteOperationButton.getElement()).click().perform();
    }

    public void clickInvoiceButton() {
        invoiceOperationButton.click();
    }

}
