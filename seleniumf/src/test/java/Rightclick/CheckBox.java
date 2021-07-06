package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		//3lines code used for check all checkbox
		WebElement radio=driver.findElement(By.id("doi0"));
		Actions actions=new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		driver.findElement(By.name("interest_market_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("interest_market_c")).click();
		
	
		
		
		
	

	}

}
 