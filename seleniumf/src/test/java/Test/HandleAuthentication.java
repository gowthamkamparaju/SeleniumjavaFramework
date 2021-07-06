package Test;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthentication {
	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth"); instead of this use for username/psswd
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		

		
		
		
	

	}

}
   