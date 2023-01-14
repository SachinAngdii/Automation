package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageUrl {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String url="https://www.gmail.com";
		driver.get(url);
		String strUrl = driver.getCurrentUrl();
		System.out.println("current Url is:"+strUrl);
		driver.quit();
	}

}
