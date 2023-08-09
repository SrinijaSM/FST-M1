package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println(title);

        WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement UN = driver.findElement(By.cssSelector("input[class^='username'][type='text']"));
        System.out.println(UN.getCssValue("value"));
        UN.sendKeys("admin");

        WebElement PW = driver.findElement(By.xpath("//input[starts-with(@class, 'password')and(@type ='password')]"));
       /// WebElement PW = driver.findElement(By.cssSelector("input[class$='password']"));
        System.out.println(PW.getCssValue("value"));
        PW.sendKeys("password");

        WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
        login.click();

        String message = driver.findElement(By.id("action-confirmation")).getText();

        x.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println("Login message: " + message);


        driver.quit();
    }

    }
