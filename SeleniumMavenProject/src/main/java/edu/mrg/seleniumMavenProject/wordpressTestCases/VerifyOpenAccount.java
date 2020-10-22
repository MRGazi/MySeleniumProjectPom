package edu.mrg.seleniumMavenProject.wordpressTestCases;
/*
 * @Autohor armrg;
 * This is a testcase for CreateAccount class;
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import edu.mrg.seleniumMavenProject.wordpressPages.CreateAccount;

public class VerifyOpenAccount {
	
	@Test
	public void testOpenAccount() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\BrowserDrivers\\chromedriver-86.0.4240.22\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/start/user");
		
		CreateAccount ca = new CreateAccount(driver);
		
		ca.typeEmail("mrgpopmail@gmail.com");
		
		ca.typeUserName("MRGazi1");
		
		ca.typePassword("uniPORT7861$");
		
		ca.clickCreateAccountButton();
		
		//driver.quit();
	}
	

}
