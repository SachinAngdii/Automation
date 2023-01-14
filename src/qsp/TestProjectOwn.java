package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProjectOwn {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("mngr425290\r\n"	));
			
		driver.findElement(By.name("YzAvUmY\r\n"));
		driver.findElement(By.name(""));
		
		

	}

}
