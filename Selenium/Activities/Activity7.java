package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        String x = driver.getTitle();
        System.out.println("Tile of page= "+x);
        Actions builder = new Actions(driver);

        WebElement x1 = driver.findElement(By.id("draggable"));
        WebElement x2 = driver.findElement(By.id("droppable"));
        WebElement x3 = driver.findElement(By.id("dropzone2"));

        builder.clickAndHold(x1).moveToElement(x2).release().build().perform();
        Thread.sleep(2000);

        builder.dragAndDrop(x2,x3).release().build().perform();
        Thread.sleep(2000);

        driver.quit();


    }
}
