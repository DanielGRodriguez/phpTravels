package com.qaprosoft.carina.demo.utils;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.demo.phpTravels.pages.LoginPage;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class AuthenticationUtil implements IDriverPool {

    public void login() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(R.TESTDATA.get("test_adminAccount"));
        loginPage.typePassword(R.TESTDATA.get("test_adminPassword"));
        loginPage.clickSubmitButton();
    }
}
