package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.BaseClass;

public class ProductPage extends BaseClass {
 @FindBy(xpath="//*[@id=\\\"item_4_img_link\\\"]/img")
 WebElement logo;
	public void BackPackpicture() {
	logo=driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
		if(logo.isDisplayed());
		System.out.println("Image is there");
	
	}
}
