package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static void chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
public static void launchUrl(String url) {
	driver.get(url);
}
public static void maxwindow() {
	driver.manage().window().maximize();
}
public static void pageurl() {
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
public static void pagetitle() {
	String title = driver.getTitle();
	System.out.println(title);
}
public static void fillTextBox(WebElement element,String value) {
	element.sendKeys(value);
	
}
public static void clk(WebElement ref) {
	ref.click();
	
}
}