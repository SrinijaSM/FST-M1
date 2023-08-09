package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity16 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement UN = driver.findElement(By.cssSelector("input[class$='username'][type='text']"));
        System.out.println(driver.findElement(By.tagName("label")).getText());
        UN.sendKeys("admin");

       // WebElement PW = driver.findElement(By.xpath("//input[starts-with(@name, 'name')and(@placeholder ='Password')]"));
        WebElement PW = driver.findElement(By.cssSelector("input[class$='password']"));
        PW.sendKeys("password");

        WebElement PW1 = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        PW1.sendKeys("password");

        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        email.sendKeys("real_email@xyz.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        x.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        driver.quit();

    }
}
