package edu.mrg.seleniumMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeLogo {
	
	WebDriver driver;
	
	public OrangeLogo(WebDriver driver) {
		this.driver = driver;
	}
	
	By logo = By.id("divLogo");
	
	public void verifyHomepageLogo() {
		
		WebElement hpLogo = driver.findElement(logo);
		
		if (hpLogo.isDisplayed()) {
			System.out.println("Homepage Logo is displayed on the page");
			
		} else {
			System.out.println("Homepage Logo is not displayed on the page");
		}
	}
	

}
