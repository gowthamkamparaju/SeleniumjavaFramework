package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements1 {
	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement ddown=driver.findElement(By.id("multi-select"));
		Select select =new Select(ddown);
		//calling methods in select
		select.selectByValue("california");
		select.selectByIndex(5); Thread.sleep(2000);
		List<WebElement> allItems=select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();
		select.selectByValue("california"); Thread.sleep(2000);
		select.selectByIndex(5);
		select.deselectByIndex(5);
		List<WebElement> allItems1=select.getAllSelectedOptions();
		System.out.println(allItems.size());
		


		
				

		
		
		
	

	}

}
 