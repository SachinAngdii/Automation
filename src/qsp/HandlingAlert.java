package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("btn btn-danger"));
		Thread.sleep(50000);
		Alert l = driver.switchTo().alert();
		Thread.sleep(50000);
		String text = l.getText();
		Thread.sleep(50000);
		System.out.println(text);
		l.accept();

	}

}
