package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties pop;
	public static WebDriver driver;
	public static FileInputStream file;

	// all drivers
	/*
	 * public static WebDriver driver; public static void setUp() {
	 * WebDriverManager.chromedriver().setup(); driver= new ChromeDriver();
	 * System.out.println(driver); driver.get("https://www.saucedemo.com/");
	 */
	//constructor 
	public BaseClass() {
		pop = new Properties();
		try {
			file = new FileInputStream(
					"C:\\Users\\oneon\\eclipse-workspace\\TestNG1\\src\\main\\java\\Config\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			pop.load(file);
			System.out.println("load file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
/*
	public static void setUp() {
		String webBrowser = pop.getProperty("browser");
		System.out.println(webBrowser);
		
		if (webBrowser.equalsIgnoreCase(pop.getProperty("chrome"))) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("ChromeBrowser");
		} else if (webBrowser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (webBrowser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get(pop.getProperty("url"));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

}
*/
public  static void setUp() {
			
			String webBrowser = pop.getProperty("browser");

			if (webBrowser.equalsIgnoreCase(pop.getProperty("chrome"))) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (webBrowser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (webBrowser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.get(pop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}
}		
		
		
		
		
		
		
		
		
		
		
		