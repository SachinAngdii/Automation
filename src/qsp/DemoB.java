package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	       }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new FirefoxDriver();
		
		// TODO Auto-generated method stub

	}

}
