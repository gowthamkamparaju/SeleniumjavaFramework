package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Page.Googlepg;

public class Googlesearch1 {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googlesearch();

	}
	public static void googlesearch() {
		WebDriverManager.chromedriver().setup();

		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("automation");
		Googlepg.button_search(driver).sendKeys("Automation");
		Googlepg.textbox_search(driver).sendKeys(Keys.RETURN);
		System.out.println("test completed");
		

	}

}
