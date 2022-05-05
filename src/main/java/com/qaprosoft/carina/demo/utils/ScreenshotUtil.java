package com.qaprosoft.carina.demo.utils;

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
import java.util.GregorianCalendar;

public class ScreenshotUtil implements IDriverPool {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static String getDateToString() {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy-HH.mm");
        return sdf.format(calendar.getTime());
    }

    public void takeScreenshot() {
        getScreenshot(getDateToString());
    }

    public void takeScreenshot(String customName) {
        getScreenshot(customName);
    }

    public void getScreenshot(String screenName) {
        try {
            BufferedImage image = ImageIO.read(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE));
            ImageIO.write(image, "png", new File(R.CONFIG.get("file_screenshot") + screenName + ".png"));
            LOGGER.info("Screenshot saved!");
        } catch (IOException e) {
            LOGGER.info("Unable to capture screenshot");
            e.printStackTrace();
        }
    }
}
