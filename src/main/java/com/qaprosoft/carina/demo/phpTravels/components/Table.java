package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractUIObject {

    @FindBy (xpath = "//tbody")
    private List<TableRow> rows;

    public Table(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getChosenBookingStatus(String id) {
        for(TableRow row : rows) {
            if(row.getBookingId().equals(id)) {
                return row.getBookingStatus();
            }
        }
        return "";
    }

    public void getChosenPaymentStatus(String id) {
        for(TableRow row : rows) {
            if(row.getBookingId().equals(id)) {
                row.getPaymentStatus();
            }
        }
    }

    public void deleteBooking(String id) {
        for(TableRow row : rows) {
            if(row.getBookingId().equals(id)) {
                row.clickDeleteButton();
            }
        }
    }


}
