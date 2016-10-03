package FrameTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameConcept {
	WebDriver d;
	public static void Main(String[] args)
	{
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		int frame_count=d.findElements(By.tagName("iframe")).size();
		System.out.println("iframe Count is"+frame_count);
		int link_count=d.findElements(By.tagName("a")).size();
		System.out.println("Link Count is"+link_count);
		
	}

}
