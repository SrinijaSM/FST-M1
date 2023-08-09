package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeMethod
    public void begin(){
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
    }


    @Test
    public void test(){
        String x =driver.getTitle();
        System.out.println("Tile of page is "+x);
        Assert.assertEquals("Training Support", x);
        driver.findElement(By.id("about-link")).click();
        String x1=driver.getTitle();
        System.out.println("Tile of New page is "+x1);
        Assert.assertEquals(x1, "About Training Support");
    }
    @AfterMethod
    public void end(){
        driver.close();
    }
}
