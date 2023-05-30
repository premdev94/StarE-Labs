package studentlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import login.Studentlogin;

public class Supportnewticket extends Studentlogin {
	
	
	@Test
	public void supportcreateticket() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElementByXPath("//span[text()='Support']").click();
		
		driver.findElementByXPath("//button[text()='New Ticket']").click();
		
		Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(4000);
		
		modalContainer.findElement(By.id("subject")).sendKeys("New Ticket-1");
		
		Select labname = new Select(modalContainer.findElement(By.xpath("//*[@formcontrolname='lab_id']")));
		labname.selectByValue("89");
		
		modalContainer.findElement(By.id("comment")).sendKeys("New Comments");
		
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\1.jpg");
		Thread.sleep(2000);
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\2.jpg");
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\files.zip");
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\sample.mp4");
		modalContainer.findElement(By.xpath("//*[text()=' Create ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=' New ticket created successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' New ticket created successfully ']")).getText());
		//Assert.assertTrue(false);
		
	}

}
