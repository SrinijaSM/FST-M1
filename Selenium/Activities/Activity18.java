package Activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement x = driver.findElement(By.id("multi-select"));
        Select x1 = new Select(x);

        x1.selectByVisibleText("Javascript");

//        x1.selectByIndex(4);
//        x1.selectByIndex(5);
//        x1.selectByIndex(6);

        //or
        for (int i=4;  i<=6; i++)
        {
            x1.selectByIndex(i);
        }

        x1.selectByValue("node");

        List<WebElement> selectedOptions = x1.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }


        x1.deselectByIndex(5);


        selectedOptions = x1.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
    }
