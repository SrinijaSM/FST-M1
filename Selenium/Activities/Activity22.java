package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/popups");
        String title = driver.getTitle();
        System.out.println(title);

        WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement x1 = driver.findElement(By.className("orange"));
        builder.moveToElement(x1).build().perform();
        String x2 = x1.getAttribute("data-tooltip");
        System.out.println(x2);

        x1.click();

        WebElement x3 = driver.findElement(By.id("username"));
        x3.sendKeys("admin");
        WebElement x4 = driver.findElement(By.id("password"));
        x4.sendKeys("password");
        WebElement x5 = driver.findElement(By.xpath("//button[text() = 'Log in']"));
        x5.click();

        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message"+message);

        driver.quit();
    }

}
