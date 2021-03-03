package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerce {

    @Test
    public void ecommerceSite() {
        //Initiate driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        //Open menu
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement categorylink = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")));
        categorylink.click();

        //Close menu
        WebElement menu = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hmenu-canvas-background\"]/div")));
        menu.click();

        //Scroll page down and up
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("window.scrollBy(0, -500);");

        driver.get("https://www.amazon.com/s?bbn=16225014011&rh=n%3A%2116225014011%2Cn%3A10971181011&dc&fst=as%3Aoff&pf_rd_i=16225014011&pf_rd_m=ATVPDKIKX0DER&pf_rd_p=a3460e00-9eac-4cab-9814-093998a3f6d8&pf_rd_r=BJWCQXPQT8MEHBQVPQ9J&pf_rd_s=merchandised-search-4&pf_rd_t=101&qid=1489014608&rnid=16225014011&ref=s9_acss_bw_cts_AESPORVN_T2_w");

        //Select value in dropdown
        Select dropdown = new Select(driver.findElement(By.name("s")));
        dropdown.selectByVisibleText("Price: High to Low");

        //Navigate to PDP
        WebElement product = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/h2/a/span")));
        product.click();

        //Add to cart
        WebElement addToCart = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-button")));
        addToCart.click();

        //Proceed to checkout
        WebElement proceedToCheckout = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("hlb-ptc-btn-native")));
        proceedToCheckout.click();

        //driver.quit();
    }
}
