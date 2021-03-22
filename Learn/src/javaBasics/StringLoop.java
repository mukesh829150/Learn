package javaBasics;

import java.util.Arrays;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StringLoop {
	
	WebDriver driver;
	String driverpath=System.getProperty("user.dir")+"\\Drivers";
	
	//2,4,8,2,4,8,2,4,8.....
			//input=5-->8
			//input=0-->2
			//input=2-->8

	public static void main(String[] args) {
		String[] a = {"abcde","nji"};
		System.out.println(Arrays.toString(a));
	}
	
	@Test
	public void test() {
		String chromepath=driverpath+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.navigate().to("https://news.google.co.in/");
		driver.navigate().to("http://google.com/");
		Set<String> abc=driver.getWindowHandles();
		System.out.println(abc);
	}

}
