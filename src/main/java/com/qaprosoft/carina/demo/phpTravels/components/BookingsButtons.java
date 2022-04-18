package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingsButtons extends AbstractUIObject{

    @FindBy(xpath = "//div[@class='row gx-3']/div[1]")
    private ExtendedWebElement buttonConfirmed;

    @FindBy(xpath = "//div[@class='row gx-3']/div[2]")
    private ExtendedWebElement buttonPending;

    @FindBy(xpath = "//div[@class='row gx-3']/div[3]")
    private ExtendedWebElement buttonCancel;

    @FindBy(xpath = "//div[@class='row gx-3']/div[4]")
    private ExtendedWebElement buttonPaid;

    @FindBy(xpath = "//div[@class='row gx-3']/div[5]")
    private ExtendedWebElement buttonUnpaid;

    @FindBy(xpath = "//div[@class='row gx-3']/div[6]")
    private ExtendedWebElement buttonRefunded;

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

    public BookingsButtons(WebDriver driver) {
        super(driver);
    }
}
