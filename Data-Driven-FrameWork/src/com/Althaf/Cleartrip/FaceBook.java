package com.Althaf.Cleartrip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\Data-Driven-FrameWork\\Data.properties");
	Properties p= new Properties();
	p.load(fis);
	String url=p.getProperty("url");
	String email=p.getProperty("email");
	String pass=p.getProperty("pass");
	ChromeDriver d=new ChromeDriver();
	d.get(url);
	d.findElement(By.name("email")).sendKeys(email);
	d.findElement(By.id("pass")).sendKeys(pass);
	d.findElement(By.id("u_0_b")).click();
	
}
}
