package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchobj {
	WebDriver driver =null;
	By textBox_search=By.id("lst-id");
	By button_search= By.name("csi");
	public  Googlesearchobj (WebDriver driver) {
		this.driver=driver;
	}
	public void setTextinsearchbox(String text) {
		driver.findElement(textBox_search).sendKeys(text);
	}
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	

}
