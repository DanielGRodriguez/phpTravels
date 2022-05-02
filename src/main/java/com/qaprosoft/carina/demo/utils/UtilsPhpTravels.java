package com.qaprosoft.carina.demo.utils;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.demo.phpTravels.pages.LoginPage;
import freemarker.template.SimpleDate;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilsPhpTravels implements IDriverPool {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public static Calendar calendar = new GregorianCalendar();
    public static SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy-HH.mm");

    public static String dateToString(Date date) {
        return sdf.format(date);
    }
    public static void login(LoginPage loginPage) {
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(R.TESTDATA.get("test_adminAccount"));
        loginPage.typePassword(R.TESTDATA.get("test_adminPassword"));
        loginPage.clickSubmitButton();
    }

    public void takeScreenshot() {
        String screenName = dateToString(calendar.getTime()) + ".png";
        File outputFile = new File("reports//screenshots//" + screenName);
        BufferedImage image = null;
        try {
            image = ImageIO.read(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE));
            ImageIO.write(image, "png", outputFile);
            LOGGER.info("Screenshot saved!");
        } catch (IOException e) {
            LOGGER.info("Unable to capture screenshot");
            e.printStackTrace();
        }
    }


}
