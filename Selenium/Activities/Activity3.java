package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        String x = driver.getTitle();
        System.out.println("Title of page =:"+x);

        WebElement x1 = driver.findElement(By.xpath("//input[@id='username']"));
        x1.sendKeys("admin");

        WebElement x2 = driver.findElement(By.xpath("//input[@id ='password']"));
        x2.sendKeys("password");

        WebElement x3 = driver.findElement(By.xpath("//button[contains (@class,'ui button')]"));
        x3.click();
        Thread.sleep(2000);


        driver.quit();
    }
}