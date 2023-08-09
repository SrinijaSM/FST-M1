package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        String title = driver.getTitle();
        System.out.println(title);

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr"));
        System.out.println("Row Size = "+rows.size());

        List<WebElement> col = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/thead/tr[1]/th"));
        System.out.println("Column Size = "+col.size());

        WebElement x = driver.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row second col = "+x.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();

        Thread.sleep(5000);

        WebElement x1= driver.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row second col after sorting = "+x1.getText());

        List<WebElement> footer = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tfoot//tr[1]/th"));
        System.out.println("Footer values");
        for(WebElement cell : footer) {
            System.out.println(cell.getText());
        }


        driver.quit();
    }
}
