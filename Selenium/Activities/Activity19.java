package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity19 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println(title);

        WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement x1 = driver.findElement(By.id("confirm"));
        x1.click();

        x.until(ExpectedConditions.alertIsPresent());

        Alert x2 =  driver.switchTo().alert();
        System.out.println(x2.getText());

        x2.accept();
        Thread.sleep(2000);

        x1.click();
        x2.dismiss();
        Thread.sleep(5000);
        driver.quit();
    }
}
