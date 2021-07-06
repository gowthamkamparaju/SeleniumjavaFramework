package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBox {
	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		//3lines code used for check all checkbox
		WebElement radio1=driver.findElement(By.id("redeemFlights"));
		radio1.click();
		//is selected is used for true/false 
		System.out.println(radio1.isSelected());
		
	
		
		
		
	

	}

}
   