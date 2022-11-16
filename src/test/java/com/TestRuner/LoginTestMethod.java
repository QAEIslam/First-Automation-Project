package com.TestRuner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Utils.Common;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class LoginTestMethod extends BaseClass {
	public LoginPage lg;
	public ProductPage pg;

	LoginTestMethod() {
		super();
	}

	@BeforeTest
	public void Initialised() {
		setUp();
		lg = new LoginPage();

	}

	@Test(enabled = true, priority = 2)
	public void Test() {
		System.out.println("call method");
		// lg = new LoginPage();
		lg.signUp("standard_user", "secret_sauce");
//driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");

	}

	@Test
	public void titelTest() {
		String titel = lg.verifyTitel();
		Assert.assertEquals(titel, "Swag Labs");
	Common.takeScreenshot();
	}

	@Test(enabled = true, priority = 1)
	public void Titeltest() {
		String titel = lg.title();
		Assert.assertEquals(titel, "Swag Labs");
	}
	@Test
	public void Bacpictest() {
		 pg.BackPackpicture();
		 
		
	}

	@AfterTest
	public void driverClose() throws InterruptedException {
		Thread.sleep(7000);
		driver.close();
	}

}
