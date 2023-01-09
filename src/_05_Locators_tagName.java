import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {
try {
    WebDriver driver = Driver.getDriver();

    driver.get("https://techglobal-training.netlify.app/");
    Waiter.pause(2);

    driver.findElement(By.id("dropdown-button")).click();
    Waiter.pause(2);


    driver.findElement(By.id("frontend-option")).click();
    Waiter.pause(2);


    WebElement hedaing = driver.findElement(By.id("main_heading"));

    if ((hedaing.isDisplayed()) ) System.out.println("Heading display passed ");
    else System.out.println("Heading display failed " +
            "" +
            "");
} catch (Exception e ){
            System.out.println("test failed due to" + e.getMessage());
        }

    }
}
