package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectALLOption {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Hotel.html");
		WebElement mtrlistBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistBox);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.deselectByVisibleText("dosa");
		s.deselectByVisibleText("idly");
		s.deselectByIndex(2);
		s.deselectByValue("d");
		System.out.print(s.isMultiple());
	}
}

