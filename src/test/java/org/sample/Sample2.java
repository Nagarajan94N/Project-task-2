package org.sample;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserlaunch("edge");
		geturl("https://www.flipkart.com/");
		implicitlyWait(20);
	}

	@AfterClass
	private void afterClass() {
		quit();
	}

	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("start time" + d);
	}

	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("end time " + d);

	}

	@Test
	private void test() {
		LocatorClass l = new LocatorClass();
		l.getClosebutton().click();
//		implicitlyWait(10);
		sendkeys(l.getTxtsearch(), "iphone");
        l.getClick().click();
		List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		Map<Integer, String> pair  = new HashMap<Integer,String>();
		for(int i=0;i<iphone.size();i++) {
			String name = iphone.get(i).getText();
			String pricess = price.get(i).getText();
			
			if(pricess.contains(",")) {
				pricess=pricess.replace(",", "");
			}
			if(pricess.contains("₹")) {
				pricess=pricess.replace("₹", "");
			}
			int inprice = Integer.parseInt(pricess); //string into integer
		 pair.put(inprice, name);
		}
		//System.out.println(pair);
		
		Set<Integer> keys =pair.keySet();
		System.out.println("Maximum  "+Collections.max(keys));
		System.out.println("Minimum  "+Collections.min(keys));
	}

}
