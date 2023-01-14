package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectNew {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		WebElement username = driver.findElement(By.name("uid"));
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("btnLogin"));
		username.sendKeys("mngr425290");  
		password.sendKeys("YzAvUmY");
		login.click();

	}

}
