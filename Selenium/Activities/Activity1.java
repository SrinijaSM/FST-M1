package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net");
        String x = driver.getTitle();
        System.out.println("Home page Title is ="+ x);

        WebElement a = driver.findElement(By.id("about-link"));
        System.out.println(a.getText());
        a.click();

        Thread.sleep(1000);

        String b = driver.getTitle();
        System.out.println("Tile of the page is =:"+b);

        driver.quit();
    }
}
