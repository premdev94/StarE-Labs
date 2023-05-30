package Adminlogintestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Facultycreate extends Adminlogin {
	
	@Test
	public void createfaculty() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Faculty ']").click();
		
		driver.findElementByXPath("//button[text()='Add Faculty']").click();
		
        Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(2000);
		
		modalContainer.findElement(By.id("firstName")).sendKeys("A First Name");
		modalContainer.findElement(By.id("lastName")).sendKeys("ALastName");
		modalContainer.findElement(By.id("registerNumber")).sendKeys("AFN00022");
		modalContainer.findElement(By.id("emailId")).sendKeys("afirstlast023@gmail.com");
		modalContainer.findElement(By.id("mobileNumber")).sendKeys("9320304118");
		List<WebElement> checkboxes=modalContainer.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		 
		 for(int i=0; i<checkboxes.size(); i++)
		 {
			 checkboxes.get(i).click();
		 }
		Thread.sleep(3000);
		
		modalContainer.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=' Faculty created successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Faculty created successfully ']")).getText());
	}

}
