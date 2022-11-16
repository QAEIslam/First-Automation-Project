package com.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;

public class Common extends BaseClass {
 public static void takeScreenshot() {
/*	 
	TakesScreenshot sc=(TakesScreenshot) driver; 
	  File src = sc.getScreenshotAs(OutputType.FILE); 
	  File destFile = new File(".\\target\\pic.png");
	  try {
		FileUtils.copyFile(src, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
*/
	 
	 TakesScreenshot sc=(TakesScreenshot) driver; 
	  File src =sc.getScreenshotAs(OutputType.FILE); 
	  String currentDir= System.getProperty("user.dir");
	 // File destFile = new File(".\\target\\pic.png");
	  try {
		FileUtils.copyFile(src, new File(currentDir +"/screenshots/"+ System.currentTimeMillis()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



 }

}
