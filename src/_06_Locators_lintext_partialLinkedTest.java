import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

public class _06_Locators_lintext_partialLinkedTest {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontEndTesting();

        driver.findElement(By.id("card-1")).click();

        WebElement redApple = driver.findElement(By.linkText("Red Apple"));
        WebElement greenApple = driver.findElement(By.linkText("Green Apple"));
        WebElement pineApple = driver.findElement(By.linkText("Pineapple"));


        System.out.println(redApple.isDisplayed());
        System.out.println(greenApple.isEnabled());
        System.out.println(pineApple.getText());

        Driver.quitDriver();


    }
}
