package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String x1 = driver.getTitle();
        System.out.println(x1);

        WebElement x = driver.findElement(By.cssSelector("input.willDisappear"));
        System.out.println("Is checkbox is selected ="+x.isSelected());
        x.click();

        System.out.println("Is checkbox is selected ="+x.isSelected());

        driver.quit();
    }

    }
