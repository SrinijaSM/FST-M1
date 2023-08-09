package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        String title = driver.getTitle();
        System.out.println(title);

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println("Row size is  = " +rows.size());

        List<WebElement> colo = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println("Coloums size is  = " +colo.size());

        List<WebElement> x = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        System.out.println("Third row values");
        for(WebElement cell : x) {
            System.out.println(cell.getText());
        }

        WebElement x1 = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second value = " +x1.getText());



        driver.quit();
    }
}
