package com.abc.bang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
WebDriver d;
@Test
@BeforeMethod
@Parameters("browser")
public void test(String browser) {
	if(browser.equals("chrome"))
	    d=new ChromeDriver();
	else
		d=new InternetExplorerDriver();
}
@Test
public void test1() {
	d.get("https://www.magento.com");
}
}
