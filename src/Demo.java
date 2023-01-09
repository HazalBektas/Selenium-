import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/hazalbektas/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://www.google.com/");

        String title = driver.getTitle();

        System.out.println(title);


        driver.quit();




    }
}
