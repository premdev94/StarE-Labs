package Adminlogintestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Adminlogin;

public class Materialupload extends Adminlogin {
	
	@Test
	public void curriculummaterialupload() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//span[text()=' Curriculum ']").click();
		Thread.sleep(2000);
		Select display = new Select(driver.findElementByXPath("//*[@aria-label='Default select example']"));
		display.selectByValue("10");
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[text()='Last']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table/tbody/tr[last()]/td[1]").click();
		
		driver.findElement(By.xpath("//*[text()='Docs']")).click();
		WebElement linkclick=driver.findElement(By.xpath("//*[text()='+']"));
		linkclick.click();
		linkclick.click();
		driver.findElement(By.id("addUrl0")).sendKeys("https://dev.digilabs.ai/curriculum/284?status=1");
		driver.findElement(By.id("addUrl1")).sendKeys("https://dev.digilabs.ai/curriculum/284?status=2");
		driver.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\1.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\2.jpg");
		driver.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\files.zip");
		driver.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\sample.mp4");
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		
	} 

}
