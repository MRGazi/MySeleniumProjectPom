package edu.mrg.seleniumMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeLogin {
	
	WebDriver driver;
	
	public OrangeLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginButton = By.id("btnLogin");
	
	public void userName(String uName) {
		WebElement weName = driver.findElement(userName);
		weName.sendKeys(uName);
		System.out.println("Username Entered Successfully");
	}
	
	public void enterPassword(String pass) {
		WebElement wePassword = driver.findElement(password);
		wePassword.sendKeys(pass);
		System.out.println("Password Entered Successfully");
	}
	
	public void loginButton() {
		WebElement login = driver.findElement(loginButton);
		login.click();
		System.out.println("Loginbutton clicked Successfully");
	}

}
