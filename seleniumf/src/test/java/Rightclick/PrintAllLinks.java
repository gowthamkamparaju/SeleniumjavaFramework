package Rightclick;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {
	public static void main(String[] args)  {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
	    List<WebElement> alltags =  (List<WebElement>) driver.findElementByTagName("option");
	    System.out.println("total tags are:"+alltags.size());
	    for (int i=0; i<alltags.size(); i++)
	    {
	    	System.out.println("links on pg are:"+alltags.get(i).getAttribute("value"));
	    	System.out.println("links on pg are:"+alltags.get(i).getText());
	    }
	
		
				

		
		
		
	

	}

}
 