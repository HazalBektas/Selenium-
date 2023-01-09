import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {
        /*



         */

        // 1. Setup
        System.setProperty("webdriver.chromedriver",  "/Users/hazalbektas/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        // 2. Validation

        driver.get("https://techglobal-training.netlify.app/");

        Thread.sleep(2000);

        WebElement  logo = driver.findElement(By.id("logo"));

        if (logo.isDisplayed()) System.out.println("Logo validation passed");
        else System.out.println("Logo validation failed");

       // System.out.println(logo.isEnabled());
        //System.out.println(logo.isSelected());


        System.out.println(logo.isDisplayed());


        //3. Teardown

        driver.quit();
    }
}
