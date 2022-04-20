package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractUIObject {

    @FindBy (xpath = "//tbody")
    private List<TableRow> rows;

    public Table(WebDriver driver) {
        super(driver);
    }

    public void deleteBooking(String id) {
        for(TableRow row : rows) {
            if(row.getBookingId().equals(id)) {
                row.clickDeleteButton();
            }
        }
    }
}
