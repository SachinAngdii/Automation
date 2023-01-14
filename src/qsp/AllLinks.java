package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
		Thread.sleep(3000);
		List<WebElement>r=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count = r.size();
		System.out.print(count);
		for(int i=0;i<count;i++)
		{
			String text = r.get(i).getText();
			System.out.println(text);
		}
		r.get(0).click();
		driver.close();

	}

}
