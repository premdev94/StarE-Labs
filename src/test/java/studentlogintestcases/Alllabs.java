package studentlogintestcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import login.Studentlogin;

public class Alllabs extends Studentlogin {
	
	
	@Test
	public void checkalllabs() throws InterruptedException
	{
		
		WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("IoT");
		Thread.sleep(2000);
		search.clear();
		driver.findElementByXPath("//div[text()='Standard Labs - 53']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Advanced Labs - 2']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[1]/div[6]/div/div").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()=' Devops - 4 ']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Standard Labs - 53']").click();
		Thread.sleep(2000);
		
		

}
}