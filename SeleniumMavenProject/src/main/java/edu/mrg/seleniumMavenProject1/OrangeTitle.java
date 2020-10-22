package edu.mrg.seleniumMavenProject1;

import org.openqa.selenium.WebDriver;

public class OrangeTitle{
	
	WebDriver driver;
	
	public OrangeTitle(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyHomepageTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title Verified Successfully!");
			
		}else {
			System.out.println("Title is not verified");
		}
	}
	

}
