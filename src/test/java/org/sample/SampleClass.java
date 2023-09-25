package org.sample;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClass extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserlaunch("edge");
		geturl("https://www.flipkart.com/");
		implicitlyWait(20);
	}

	@AfterClass
	private void afterClass() {

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

		for (int i = 0; i < iphone.size(); i++) {
		}
		for (int i = 0; i < price.size(); i++) {
			System.out.println(iphone.get(i).getText() + "" + price.get(i).getText());

		}}}
