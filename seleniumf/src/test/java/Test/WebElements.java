package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {
	public static void main(String[] args) {

	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name ("firstname")).clear();
		
		System.out.println( driver.findElement(By.name("firstname")).getAttribute("Class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).getCssValue("text-tarnsform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).isSelected());
				

		
		
		
	

	}

}
 