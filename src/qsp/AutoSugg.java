package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("www.amazon.com");
	 driver.findElement(By.name("q")).sendKeys("");
	 String xp = "//div[contains(text(),'sbct')]";
	 List<WebElement> autosugg = driver.findElements(By.xpath("//b"));
		int count=autosugg.size();
		System.out.print(count);
		int position=0;
		for(int i=0;i<count;i++)
		{
			String text = autosugg.get(i).getText();
			System.out.print(text);
			if(text.equals("qspiders")) {
				position=i;	
			}
		}
		autosugg.get(position).click();
   driver.quit();
	}
}
