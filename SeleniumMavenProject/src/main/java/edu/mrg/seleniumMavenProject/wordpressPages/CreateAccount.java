/**
 * 
 */
package edu.mrg.seleniumMavenProject.wordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author armrg;
 * 
 * This class will contain all the locators and methods of CreateAccount page.
 *
 */
public class CreateAccount {
	
	WebDriver driver;
	
	By email = By.id("email");
	By userName = By.id("username");
	By password = By.id("password");
	By createAccount = By.xpath("//button[contains(text(),'Create your account')]");
	
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeEmail(String mail) {
		WebElement elementEmail = driver.findElement(email);
		elementEmail.sendKeys(mail);
	}
	
	public void typeUserName(String uName) {
		WebElement elementUserName = driver.findElement(userName);
		elementUserName.sendKeys(uName);
	}
	
	public void typePassword(String pWord) {
		WebElement elementPassword = driver.findElement(password);
		elementPassword.sendKeys(pWord);
	}
	
	public void clickCreateAccountButton() {
		WebElement elementAccountButton = driver.findElement(createAccount);
		elementAccountButton.click();	
	}
}
