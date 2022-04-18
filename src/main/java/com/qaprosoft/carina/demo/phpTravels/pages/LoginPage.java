package com.solvd.phpTravels.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.phpTravels.components.LoginBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {


    @FindBy(xpath = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div")
    private LoginBlock loginBlockWindow;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://phptravels.net/api/admin");
    }
}
