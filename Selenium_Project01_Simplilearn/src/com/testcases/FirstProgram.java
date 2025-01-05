package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		String PageURL = dr.getCurrentUrl();
		System.out.println(PageURL);
		String PageTitle = dr.getTitle();
		System.out.println(PageTitle);
		String PageSource = dr.getPageSource();
		dr.navigate().to("https://www.amazon.in/");
		String CurrentURL = dr.getCurrentUrl();
		System.out.println("The navigateed URL is"+CurrentURL);
		dr.navigate().back();
		dr.navigate().forward();
		dr.navigate().refresh();
		dr.close();
	}
}