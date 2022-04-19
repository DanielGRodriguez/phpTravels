package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractUIObject {

    public List<TableRow> tableRows = new ArrayList<>();

    public Table(WebDriver driver) {
        super(driver);
    }
}
