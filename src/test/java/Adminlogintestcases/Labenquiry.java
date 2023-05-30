package Adminlogintestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Labenquiry extends Adminlogin {
	
	@Test
	public void checklabenquiry() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Labs ']").click();
		
		driver.findElementByXPath("//app-labs-card-list/div/div[2]/div/div/div[2]/div[3]/div/div/span[2]").click();
		
        Thread.sleep(3000);
		
		driver.findElement(By.id("contact_person_name")).sendKeys("Test Person Name");
		driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=' Thank you ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Thank you ']")).getText());
		
		Thread.sleep(2000);
		driver.findElementByClassName("btn-close").click();
	}

}
