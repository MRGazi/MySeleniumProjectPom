package edu.mrg.seleniumMavenProject1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This executes beforeSuite");
	}
	
	@AfterSuite
	public void atereSuite() {
		System.out.println("This executes afterSuite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This executes beforeClass");
	}
	
	 @AfterClass
	 public void afterClass() {
		 System.out.println("This executes afterClass");
	 }
	 
	 @Test  
	 public void createTest1() {
		System.out.println("This is a createTest1");
	 }
	 
	 @Test
	 public void createTest2() {
		 System.out.println("This is a createTest2");
	 }
	 
	 @Test
	 public void createTest3() {
		 System.out.println("This is a createTest3");
	 }

}
