package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void begin(){
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }


    @Test
    public void test(){
        String x =driver.getTitle();
        System.out.println("Tile of page is "+x);
        WebElement x1 = driver.findElement(By.id("username"));
        x1.sendKeys("admin");
        WebElement x2 = driver.findElement(By.id("password"));
        x2.sendKeys("password");
        WebElement x3 = driver.findElement(By.xpath("//button[text()='Log in']"));
        x3.click();
        WebElement x4 = driver.findElement(By.id("action-confirmation"));
        String message = x4.getText();
        System.out.println(message);
        Assert.assertEquals("Welcome Back, admin",message);
    }


    @AfterClass
    public void end(){
        driver.close();
    }
}
