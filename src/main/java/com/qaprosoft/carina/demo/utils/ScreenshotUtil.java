package com.qaprosoft.carina.demo.utils;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ScreenshotUtil implements IDriverPool {
    String screenName;

    File outputFile = null;

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static Calendar calendar = new GregorianCalendar();

    public static SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy-HH.mm");

    public static String dateToString(Date date) {
        return sdf.format(date);
    }

    public void takeScreenshot() {
        screenName = dateToString(calendar.getTime()) + ".png";
        outputFile = new File(R.CONFIG.get("fileScreenshot") + screenName);
        getScreenshot();
    }

    public void takeScreenshot(String customName) {
        screenName = customName + ".png";
        outputFile = new File(R.CONFIG.get("fileScreenshot") + screenName);
        getScreenshot();
    }

    public void getScreenshot() {
        try {
            BufferedImage image = ImageIO.read(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE));
            ImageIO.write(image, "png", outputFile);
            LOGGER.info("Screenshot saved!");
        } catch (IOException e) {
            LOGGER.info("Unable to capture screenshot");
            e.printStackTrace();
        }
    }
}
