package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
public class LoginPage extends BaseClass {
//Elements + Action class

	@FindBy(id="user-name")
	WebElement UserName;
	@FindBy(id="password")
	WebElement password;


	
	public LoginPage(){
	PageFactory.initElements(driver, this);

		
	} 
	public String title() {
		String FirstTitle= driver.getTitle();
	//	System.out.println("It is title :::"+FirstTitle);
		return FirstTitle;
	}
	
	public LoginPage signUp(String uName, String Pass) {
		UserName.sendKeys(uName);
		//standard_user
		password.sendKeys(Pass);
		driver.findElement(By.id("login-button")).click();
		//String title= driver.getTitle();
	//	System.out.println("It is title :::"+title);
		//secret_sauce
		return new LoginPage();
	 
	}
	public String verifyTitel() {
		String myTitel=driver.getTitle();
		//String expectedTitle=("Swag Labs");
		//System.out.println("title cheeeking");
		//Assert.assertEquals(myTitle, expectedTitle);
		//System.out.println("title test pass or fail");
		return myTitel;
		
		
	}
	
}
