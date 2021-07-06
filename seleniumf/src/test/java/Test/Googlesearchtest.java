package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Googlesearchobj;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchtest {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googlesearchtest();
		
	}
	public static void googlesearchtest() {
		
		WebDriverManager.chromedriver().setup();

		 driver=new ChromeDriver();
		 Googlesearchobj searchpgobj = new Googlesearchobj(driver);
		 driver.get("https://www.google.com");
		 
		 searchpgobj.setTextinsearchbox("abc");
		 
		 searchpgobj.clickSearchButton();
		 driver.close();
		 
				 

		
	}

}
