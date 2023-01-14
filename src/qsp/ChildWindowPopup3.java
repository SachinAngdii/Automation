package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("apple-signin-button"));
			Thread.sleep(3000);
			driver.findElement(By.id("login-facebook-button"));
			Thread.sleep(3000);
			Set<String> allwh = driver.getWindowHandles();
			int count=allwh.size();
			System.out.print(count);
			for(String wh:allwh)
			{
				System.out.print(wh);
          	}
			Thread.sleep(3000);
		}
}
