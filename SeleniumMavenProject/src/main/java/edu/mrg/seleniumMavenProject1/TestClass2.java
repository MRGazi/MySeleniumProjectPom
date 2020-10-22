package edu.mrg.seleniumMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass2 {
	WebDriver driver;
	OrangeTitle title;
	OrangeLogo 	logo;
	OrangeLogin login;
	OrangeTeardown teardown;
	
	
	
	@BeforeSuite
	public void baseClss() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\BrowserDrivers\\chromedriver-86.0.4240.22\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Homepage launched successfully");
		Thread.sleep(4000);
	}
	
	@Test(priority = 1)
	public void verifyOrangeTitle() {
		title = new OrangeTitle(driver);
		title.verifyHomepageTitle();
	}
	
	@Test(priority = 2)
	public void verifyOrangeLogo() {
		logo = new OrangeLogo(driver);
		logo.verifyHomepageLogo();
	}
	
	@Test(priority = 3)
	public void verifyOrangeLogin() {
		login = new OrangeLogin(driver);
		login.userName("Admin");
		login.enterPassword("admin123");
		login.loginButton();
	}
	
	@AfterSuite
	public void teardownHomepage() {
		teardown = new OrangeTeardown(driver);
		teardown.teardownHomepage();
	}
	
}
