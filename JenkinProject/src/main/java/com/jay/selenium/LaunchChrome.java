package com.jay.selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static final Logger logger = Logger.getLogger(LaunchChrome.class);

	public static void main(String[] args) throws InterruptedException {

		String configFileName = "C:\\Users\\Jayprakash\\git\\repository2\\JenkinProject\\log4j.properties";
		PropertyConfigurator.configure(configFileName);
		System.setProperty("webdriver.chrome.driver", "F:\\2022_Study\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		logger.info("Title " + driver.getTitle());
		logger.info("new message");
		driver.manage().window().maximize();
		driver.close();

	}

}
