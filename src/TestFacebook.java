import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestFacebook {

    public static void main(String[] args) {
        try {
            WebDriver driver = Driver.getDriver();

            driver.navigate().to("https://www.facebook.com/");
            Waiter.pause(3);


            if (driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title is valid test PASSED");
            else System.out.println("Title validation has FAILED");


            if (driver.getCurrentUrl().equals("https://www.facebook.com/"))
                System.out.println("The URL validation has passed");
            else System.out.println("The URL validation has failed");


            WebElement logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
            if (logo.isDisplayed()) System.out.println("Logo is displayed VALIDATION PASSED");
            else System.out.println("Logo is not displayed validation FAILED");

            WebElement heading2 = driver.findElement(By.className("_8eso"));
            if ((heading2.isDisplayed())) System.out.println("Heading2 existing validation PASSED");
            else System.out.println("Heading 2 is displayed validation FAILED");

            WebElement email = driver.findElement(By.id("email"));
            Waiter.pause(2);
            if (email.isDisplayed()) System.out.println("Email input box existing validation PASSED");
            else System.out.println("Email input box validation FAILED");

            WebElement password = driver.findElement(By.id("passContainer"));
            Waiter.pause(2);
            if (password.isDisplayed()) System.out.println("Password input box validation PASSED");
            else System.out.println("Password input box validation FAILED");


            WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
            Waiter.pause(2);
            if (login.isEnabled()) System.out.println("Log In button is enabled validation PASSED");
            else System.out.println("Log In button is enabled validation FAILED");


            WebElement forgotPassword = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
            Waiter.pause(2);
            if (forgotPassword.isDisplayed()) System.out.println("Forgot password validation PASSED");
            else System.out.println("Forgot password validation FAILED");


            WebElement createANewAccount = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
            Waiter.pause(2);
            if (createANewAccount.isDisplayed()) System.out.println("Create a new account button validation PASSED");
            else System.out.println("Create a new account button validation FAILED");

        }catch (Exception e){
            System.out.println("Test has failed due to " + e.getMessage());
        }


finally {
            Driver.quitDriver();
        }



    }
}
