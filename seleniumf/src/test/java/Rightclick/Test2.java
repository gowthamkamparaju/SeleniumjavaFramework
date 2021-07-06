package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static String browser="chrome";
	public static WebDriver driver=null;
	public static void main(String[] args) {
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String Currenturl=driver.getCurrentUrl();
		System.out.println(Currenturl);
		String title= driver.getTitle();
		System.out.println(title);
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		driver.navigate().to("http://www.google.com");
		driver.close();
	}

}
