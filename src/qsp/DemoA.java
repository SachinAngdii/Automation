package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DemoA{
	static void testA(WebDriver driver) throws InterruptedException
	{
		driver.get("http://google.com/");
		String title=driver.getTitle();
		Thread.sleep(3000);
		System.out.print(title);
		Thread.sleep(4000);
		 Dimension d = new Dimension(200, 300);
	
		 Thread.sleep(6000);
	}
}
