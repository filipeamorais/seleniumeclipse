package introductionselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );

        // Setting the chromedriver path
        System.setProperty("webdriver.chrome.driver", "C:\\1.installers\\chromedriver_win32\\chromedriver.exe");

        //Invoking browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/#/index");
        System.out.println(driver.getTitle());
        //driver.close();
        driver.quit(); //it is used to quit all the browser pages
        }

}
