package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getUrl {

    // @BeforeClass
    //public static void setupClass() {
    //WebDriverManager.chromedriver().setup();
    // }

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk/");

        //Click on the link
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement chapter1 = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("/html/body/div[2]/ul/li[1]/a")));
        chapter1.click();

        //Select radiobutton
        WebDriverWait wait1 = new WebDriverWait(driver, 5);
        WebElement radio = wait1.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("radiobutton")));
        radio.click();

        //Select value from dropdown
        Select dropdown = new Select(driver.findElement(By.id("selecttype")));
        dropdown.selectByValue("Selenium Grid");
        driver.quit();

    }
}
