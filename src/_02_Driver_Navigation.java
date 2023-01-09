import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chromedriver",  "/Users/hazalbektas/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();
       //driver.get("https://www.techglobalschool.com"); // no cahses
        driver.navigate().to("https://www.amazon.com/"); // keep cashes


        driver.navigate().refresh();

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();




        if (driver.getCurrentUrl().equals("https://www.amazon.com")) System.out.println("Title validation PASSED");
        else System.out.println("Failed");




        if(driver.getTitle().equals("Amazon.com. Spend less. Smile more")) System.out.println("The validation passed");
        else System.out.println("Title validation FAILED");

        driver.quit();
    }
}
