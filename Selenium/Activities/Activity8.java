package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String x1 = driver.getTitle();
        System.out.println(x1);

        WebElement x2 = driver.findElement(By.cssSelector("input.willDisappear"));
        x2.click();

//        x.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
//        System.out.println(x2.isDisplayed());

        WebElement x3 = driver.findElement(By.cssSelector("button#toggleCheckbox"));
        x3.click();

        x.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(x2.isDisplayed());
        x3.click();

//        x.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
//        System.out.println(x2.isDisplayed());



        driver.quit();
    }
}
