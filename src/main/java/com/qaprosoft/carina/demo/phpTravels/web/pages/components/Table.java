package com.qaprosoft.carina.demo.phpTravels.web.pages.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Table extends AbstractUIObject {

    @FindBy (xpath = "//tbody/tr[contains(@class, 'xcrud-row')]")
    private List<TableRow> rows;

    public Table(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getChosenBookingStatus(String id) {
        for (TableRow row : rows) {
            if (row.getBookingId().equals(id)) {
                return row.getBookingStatus();
            }
        }
        return "";
    }

    public String getChosenPaidStatus(String id) {
        for (TableRow row : rows) {
            if (row.getBookingId().equals(id)) {
                return row.getPaymentStatus();
            }
        }
        return "";
    }

    public void deleteBooking(String id) {
        for (TableRow row : rows) {
            if (row.getBookingId().equals(id)) {
                row.clickDeleteButton();
            }
        }
    }

    public boolean isBookingIdExist(String id) {
        for (TableRow row : rows) {
            if (row.getBookingId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public int getRowsCount() {
        return rows.size();
    }
}
