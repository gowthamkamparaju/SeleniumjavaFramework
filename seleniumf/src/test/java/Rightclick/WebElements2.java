package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements2 {
	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown=driver.findElement(By.name("employees_c"));
		Select select =new Select(ddown);
		//calling methods in select
		select.selectByValue("level1"); Thread.sleep(2000);

		select.selectByVisibleText("51 - 100 employees");
		select.selectByIndex(5);
		
				

		
		
		
	

	}

}
 