package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement em = driver.findElement(By.id("email"));
		Point p = em.getLocation();
        System.out.println("X coordinate (in pixels):"+p.getX());
        System.out.println("Y coordinate (in pixels):"+p.getY());
	}

}
