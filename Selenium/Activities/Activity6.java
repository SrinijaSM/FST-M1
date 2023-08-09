package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        String x =driver.getTitle();
        System.out.println(x);

        Actions builder = new Actions(driver);
        builder.sendKeys("S").build().perform();

//        builder.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
//        builder.keyUp(Keys.CONTROL).sendKeys("c").build().perform();

        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        driver.quit();

    }


}
