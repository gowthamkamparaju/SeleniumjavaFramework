package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		Set<String> WindowHandle = driver.getWindowHandles();
		System.out.println(WindowHandle);
		Iterator<String> iterator=WindowHandle.iterator();
		String parentwindow=iterator.next();
		String childwindow=iterator.next();
		driver.switchTo().window(parentwindow);
	    driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Acadamy");
		driver.switchTo().window(childwindow);
		

		
		

		
		
		
	

	}

}
   