package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fsi= new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
	p.load(fsi);
	String url = p.getProperty("url", "https://demo.actitime.com/");
	System.out.println(url);
	String un = p.getProperty("username","admin");
	System.out.println(un);
	String pw=p.getProperty("password", "manager");
	System.out.println(pw);
	
	}

}
