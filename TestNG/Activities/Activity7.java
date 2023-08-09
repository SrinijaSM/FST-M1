package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {

    WebDriver driver;
    //WebDriverManager.fi

    @BeforeClass
    public void begin(){
        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }


    @Test(dataProvider = "Authentication")
    @Parameters({"username","password"})
    public void  Loginform(String username, String password)
    {
        WebElement x=driver.findElement(By.id("username"));
        x.sendKeys(username);
        WebElement y = driver.findElement(By.id("password"));
        y.sendKeys(password);
        WebElement z = driver.findElement(By.cssSelector("button[type='submit']"));
        z.click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();

        Assert.assertEquals(loginMessage, "Welcome Back, admin");

    }


    @AfterClass
    public void end(){
        driver.close();
    }
}
