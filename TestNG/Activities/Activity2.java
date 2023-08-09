package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void begin(){
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
    }


    @Test
    public void test(){
        String x =driver.getTitle();
        System.out.println("Tile of page is "+x);
        Assert.assertEquals("Training Support", x);
    }

    @Test
    public void test2(){
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));//Unable to locate element: button.black
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("third method is skipped");
    }

    @Test
    public void test4(){
        throw new SkipException("Skipping test case");
    }
    @AfterClass
    public void end(){
        driver.close();
    }
}
