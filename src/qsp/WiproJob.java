package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJob {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wiprojob"+Keys.ENTER);
		List<WebElement> url = driver.findElements(By.xpath("//a"));
		int count=url.size();
		System.out.print(count);
		for(int i=0;i<count;i++)
		{
			String wj = url.get(i).getAttribute("href");
			System.out.println(wj);
			try {
				driver.get(wj);
				break;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		

	}

}
