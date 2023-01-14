package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSuggUsingForEachLoop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe/");

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Hotel.html");
		Thread.sleep(2000);
		WebElement cplistBox = driver.findElement(By.id("cp"));
		Thread.sleep(2000);
		Select s = new Select(cplistBox);
		Thread.sleep(2000);
		List<WebElement> alloption = s.getOptions();
		for(WebElement option:alloption ) {
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
