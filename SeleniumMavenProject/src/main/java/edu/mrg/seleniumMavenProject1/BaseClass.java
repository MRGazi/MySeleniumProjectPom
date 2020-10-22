package edu.mrg.seleniumMavenProject1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
	
	WebDriver driver;
	String chromeName = "webdriver.chrome.driver";
	String chromePath = "G:\\BrowserDrivers\\chromedriver-86.0.4240.22\\chromedriver.exe";
	String url = "https://opensource-demo.orangehrmlive.com/";
	
	public void setupHomepage() {
		System.setProperty(chromeName, chromePath);
		driver = new ChromeDriver();
		System.out.println("Homepage setup successfull");
	}
	
	public void launchHomepage() throws Exception {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Homepage launched successfully");
		Thread.sleep(4000);
	}
	

}
