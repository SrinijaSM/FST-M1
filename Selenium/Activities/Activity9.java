package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait x = new WebDriverWait(driver, Duration.ofMillis(5000));

        driver.get("https://v1.training-support.net/selenium/ajax");
        String x1 = driver.getTitle();
        System.out.println(x1);

        driver.findElement(By.cssSelector("button.ui.violet")).click();

        x.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

        String x2 = driver.findElement(By.tagName("h1")).getText();
        System.out.println(x2);

        x.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "This text is loaded using AJAX" ));
        String x3 = driver.findElement(By.tagName("h3")).getText();
        System.out.println(x3);

        x.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late" ));
        String x4 = driver.findElement(By.tagName("h3")).getText();
        System.out.println(x4);


        driver.quit();
    }
}
