package com.qaprosoft.carina.demo.phpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newTests {

    private WebDriver driverChrome;

    @BeforeMethod
    public void setNavigation() {
        System.setProperty("webdriver.chrome.driver", "D:\\0.SOLVD\\phpTravel\\chromedriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("https://phptravels.net/api/admin");
    }

    @Test
    public void login() {
        driverChrome.findElement(new By.ByName("email")).sendKeys("admin@phptravels.com");
        driverChrome.findElement(new By.ByName("password")).sendKeys("demoadmin");
        driverChrome.findElement(new By.ByXPath("/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[4]/button")).click();
    }

    @AfterMethod
    public void cleanUp() {
        driverChrome.quit();
    }


}