package com.cucumber.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Test
{
	public WebDriver driver;		

	@Before
	public void beforeTest() 
	{	
		System.setProperty("webdriver.firefox.marionette","D:/N/cucumber/cucumber/geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.get("http://www.guru99.com/selenium-tutorial.html");
	}	
	
	@After
	public void afterTest()
	{
		driver.quit();			
	}
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable
	{
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Free Selenium Tutorials")); 
	}
}