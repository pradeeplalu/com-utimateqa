package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        //maximize the window
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

