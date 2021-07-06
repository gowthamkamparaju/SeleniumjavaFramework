package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.asx.com.au/");
		//step1:switch to frame which has a particular table
		//step2:get the num rows
		//step3:get the num colums
		//step4:iterate rows&columns get txt&print it
	
		
				

		
		
		
	

	}

}
 