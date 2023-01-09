import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {

    public static void main(String[] args) throws InterruptedException {

        /*

        TEST CASE


         */
        // 1. Set up
        System.setProperty("webdriver.chromedriver",  "/Users/hazalbektas/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver  driver = new ChromeDriver();

        driver.manage().window().maximize();



        // 2. Validation
        driver.get("https://www.techglobalschool.com"); // no cahses
        driver.navigate().to("https://www.techglobalschool.com"); // keep cashes





        // 3. Teardown
        Thread.sleep(2000);
        driver.quit();
    }
}
