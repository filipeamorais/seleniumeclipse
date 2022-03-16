package introductionselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );

//        // Setting the chromedriver path
//        System.setProperty("webdriver.chrome.driver", "C:\\1.installers\\chromedriver_win32\\chromedriver.exe");
//
//        //Invoking browser
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/#/index");
//        System.out.println(driver.getTitle());
//        //driver.close();
//        driver.quit(); //it is used to quit all the browser pages
		
		//System.setProperty("webdriver.gecko.driver", "C:\\1.installers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\1.installers\\\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Invoking browser
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit(); //it is used to quit all the browser pages
		
        }

}
