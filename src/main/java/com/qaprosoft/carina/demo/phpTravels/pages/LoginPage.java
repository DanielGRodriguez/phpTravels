package com.qaprosoft.carina.demo.phpTravels.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phpTravels.components.LoginBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {


    @FindBy(className = "card-body")
    private LoginBlock loginBlockWindow;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://phptravels.net/api/admin");
    }
}
