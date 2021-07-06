package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.*;

public class Properties {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	
		Properties property = new Properties();
		
		FileInputStream input=new FileInputStream("C:\\Users\\MY PC\\Desktop\\java\\SeleniumJava\\src\\Config\\Config.properties.exe");
		property.load(input);
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("url"));
		
		
	
	}  
	private char[] getProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void load(FileInputStream input) {
		// TODO Auto-generated method stub
		
	}
	

}

