package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowWithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String pwh = driver.getWindowHandle();
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(3000);
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(3000);
		for(String wh:allwh)	
		{
			driver.switchTo().window(wh);
			driver.close();
		}
	}
}