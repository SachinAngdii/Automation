package qsp;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingTheDisable {

	static  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}



	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("‪C:\\Users\\USER\\Desktop\\Disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
	    RemoteWebDriver	r=(RemoteWebDriver)driver;
	 ;
	    
	    
		

	}

}
