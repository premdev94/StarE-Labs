package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Groupcreate extends Adminlogin {
	
	@Test
	public void creategroup() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()='Student Management']").click();
		
		driver.findElementByXPath("//p[text()='Group']").click();
		
		driver.findElementByXPath("//button[text()=' Add Group ']").click();
		
        Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(2000);
		
		modalContainer.findElement(By.id("name")).sendKeys("Test Group - 1");
		
		modalContainer.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		
		String Beforecount=driver.findElementByXPath("//div[@class='total-records']").getText();
		System.out.println("After Create new group:"+Beforecount);
		
		 //Group created successfully 
		 driver.findElement(By.xpath("//*[text()=' Group created successfully ']")).isDisplayed();
		 System.out.println(driver.findElement(By.xpath("//*[text()=' Group created successfully ']")).getText());
	}

}
