package Selenimun.seleniumf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stest {
	

	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.whatsapp.com");
			driver.close();
		}

	}
 