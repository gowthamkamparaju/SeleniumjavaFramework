package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static String browser="chrome";
	public static WebDriver driver=null;
	public static void main(String[] args) {
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();}
		driver.get("https://www.selenium.dev/documentation/en/getting_started_with_webdriver/");
		driver.findElement(By.partialLinkText("Quick")).click();

	}

}
 