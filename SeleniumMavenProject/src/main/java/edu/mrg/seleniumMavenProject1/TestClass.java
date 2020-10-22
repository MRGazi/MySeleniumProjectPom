package edu.mrg.seleniumMavenProject1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	
	OrangeTitle title;
	OrangeLogo 	logo;
	OrangeLogin login;
	OrangeTeardown teardown;
	
	
	@BeforeSuite
	public void baseClss() throws Exception {
		setupHomepage();
		launchHomepage();	
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
