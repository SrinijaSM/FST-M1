package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        String x = driver.getTitle();
        System.out.println("Title of page =:"+x);

        WebElement x1 = driver.findElement(By.xpath("//h3[contains(@id, 'third-header')]"));
        System.out.println("Text of third header is =:"+x1.getText());

        String x2 = driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getAttribute("color");
        System.out.println(x2);

//        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
//        System.out.println(fifthHeaderColor);

        String x3 = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println(x3);

        String x4 = driver.findElement(By.xpath("//button[contains(text(),'Grey')]")).getText();
        System.out.println(x4);

        driver.quit();
}
}
