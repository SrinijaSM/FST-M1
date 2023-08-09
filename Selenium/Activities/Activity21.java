package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity21 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tab-opener");
        String title = driver.getTitle();
        System.out.println(title);

        WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement x1 = driver.findElement(By.id("launcher"));
        x1.click();
        x.until(ExpectedConditions.numberOfWindowsToBe(2));

        System.out.println(driver.getWindowHandles());

        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        x.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));

        System.out.println("Current tab: " + driver.getWindowHandle());

        System.out.println("Page title: " + driver.getTitle());
        String pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        driver.findElement(By.id("actionButton")).click();

        x.until(ExpectedConditions.numberOfWindowsToBe(3));

        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        x.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));

        System.out.println("Current tab: " + driver.getWindowHandle());

        System.out.println("Page title: " + driver.getTitle());
        pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);


        driver.quit();
    }
}
