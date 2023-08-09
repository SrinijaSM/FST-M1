package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String x1 = driver.getTitle();
        System.out.println(x1);

        WebElement x = driver.findElement(By.id("input-text"));
        //WebElement x = driver.findElement(By.id("dynamicText"));
        System.out.println("Text field is enabled = "+ x.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("Input field is enabled: " +x.isEnabled());
        driver.quit();
    }

}
