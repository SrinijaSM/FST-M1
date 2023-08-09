package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        String x = driver.getTitle();
        System.out.println(x);
        Actions builder = new Actions(driver);

        WebElement x1 = driver.findElement(By.id("wrapD3Cube"));
        WebElement x1_val = driver.findElement(By.className("active"));
        System.out.println(x1_val.getText());
        Thread.sleep(2000);

        //rightclick
        builder.click(x1).build().perform();
        x1_val = driver.findElement(By.className("active"));
        System.out.println(x1_val.getText());
        Thread.sleep(2000);

        //doubleclick
        builder.doubleClick(x1).build().perform();
        x1_val = driver.findElement(By.className("active"));
        System.out.println(x1_val.getText());
        Thread.sleep(2000);

        //right click
        builder.contextClick(x1).build().perform();
        x1_val = driver.findElement(By.className("active"));
        System.out.println(x1_val.getText());
        Thread.sleep(2000);


        driver.quit();

    }
}
