package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();

    driver.get("https://v1.training-support.net/selenium/selects");
    String title = driver.getTitle();
    System.out.println(title);

    WebElement x = driver.findElement(By.xpath("//select"));
    Select x1 = new Select(x);

    x1.selectByVisibleText("Option 2");
    x1.selectByIndex(3);
    x1.selectByValue("4");


    List<WebElement> x2 = x1.getOptions();
        for(WebElement options : x2) {
            System.out.println(options.getText());
        }

    driver.quit();
}
}
