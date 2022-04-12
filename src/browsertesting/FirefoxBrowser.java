package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://courses.ultimateqa.com";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get current URL
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        // find elements
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
    }
}



