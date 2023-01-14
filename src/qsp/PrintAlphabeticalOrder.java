package qsp;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Hotel.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
        ArrayList<String> A1 = new ArrayList<>();
         Select s = new Select(mtrlist);
         List<WebElement> options = s.getOptions();
         for(int i=0;i<options.size();i++) {
        	 String text = options.get(i).getText();
        	 A1.add(text);
         }
         for(String A2:A1) {
        	 System.out.println(A2);
         }
         driver.close();
         }
         }
