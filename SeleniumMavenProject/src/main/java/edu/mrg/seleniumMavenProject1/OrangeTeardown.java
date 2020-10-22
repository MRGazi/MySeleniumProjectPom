package edu.mrg.seleniumMavenProject1;

import org.openqa.selenium.WebDriver;

public class OrangeTeardown {
	
	WebDriver driver;
	
	public OrangeTeardown(WebDriver driver) {
		this.driver = driver;
	}
	
	public void teardownHomepage() {
		driver.quit();
		System.out.println("Homepage exit successfully!");
	}

}
