package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingsslerror {

	public static void main(String[] args) {
		

			WebDriverManager.chromedriver().setup();
			DesiredCapabilities dc=new DesiredCapabilities();
			//dc.setAcceptInsecureCerts(true); otherway
			dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			
			
			
			ChromeOptions coption=new ChromeOptions();
			//merge will give extra capabilites for desired capabilites
			coption.merge(dc);
			 WebDriver driver = new ChromeDriver(coption);
		driver.get("https://expired.badss1.com/");
		 

	}

}
 