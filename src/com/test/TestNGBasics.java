package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//Annotations should always link with method
	
	
	//These annotations are pre-conditions
	@BeforeSuite//1
	public void setUp() {
		System.out.println("@BeforeSuite---Setup system property from Chrome");
	}
	
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("@BeforeTest----Launch the browser");
	}
	
	@BeforeClass//3
	public void enterURL() {
		System.out.println("@BeforeClass----Enter URL");
	}
	
	
	//Creates below pair while execution
	//@BeforeMethod
	//@Test-1
	//@AfterMethod
	
	//@BeforeMethod
	//@Test-2
	//@AfterMethod
	
	//@BeforeMethod
	//@Test-3
	//@AfterMethod
	
	@BeforeMethod//4
	public void login() {
		System.out.println("@BeforeMethod---Login to Application");
	}
	
	//Test cases - starting with @Test
	@Test//5
	public void googleTitleTest() {
		System.out.println("@Test---Google title test");
	}

	@Test//5
	public void searchTest() {
		System.out.println("@Test---Searching functionality");
	}
	
	@Test//5
	public void googleLogoTest() {
		System.out.println("@Test----Testing google logo");
	}
	
	//Post conditions annotations
	@AfterMethod//6
	public void logOut() {
		System.out.println("@AfterMethod----Logout Method");
	}
	
		
	@AfterClass//7
	public void deleteAllCookies() {
		System.out.println("@AfterClass-----Delete all cookies");
	}
	
	@AfterTest//8
	public void closeBrowser() {
		System.out.println("@AfterTest-----Close the browser");
	}
	
	
	@AfterSuite//9
	public void generateTestReport() {
		System.out.println("@AfterSuite-----Generate report");
	}
}
