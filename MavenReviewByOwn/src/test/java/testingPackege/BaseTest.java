package testingPackege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	static WebDriver dr;
	
		public static void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "/Users/tawhidchowdhury/Downloads/chromedriver ");
			
			dr=new ChromeDriver();
			dr.get("https://www.express.com/");
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
		}
	}
	
	
	
	
	


