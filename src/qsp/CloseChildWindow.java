package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindow {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String pwh = driver.getWindowHandle();
		driver.findElement(By.id("//[text()='Continue with Apple']")).click();
		driver.findElement(By.id("//[text()='Continue with Facebook']")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)	
		{
			driver.switchTo().window(wh);
			{
			if(pwh.equals(wh))
			{

			}
			else
			{
				driver.close();

			}
			}
		}
	}
}


			




