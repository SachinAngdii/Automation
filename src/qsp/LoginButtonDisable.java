package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonDisable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
				driver.get("https://www.instagram.com/accounts/login/");
		boolean t = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).isEnabled();
		if(t==true) {
			System.out.print("Enabled");

		}
		else {
			System.out.print("Not Enabled");
		}

	}

}
