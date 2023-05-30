package studentlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import login.Studentlogin;

public class Scorecardcreate extends Studentlogin {
	
	
	@Test
	public void scorecardupload() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()='Scorecard']").click();
		driver.findElementByXPath("//*[text()=' Upload Test File ']").click();
		Thread.sleep(3000);
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(4000);
		
		Select labname = new Select(modalContainer.findElement(By.xpath("//*[@formcontrolname='lab']")));
		labname.selectByValue("90");
		
		Select assessment = new Select(modalContainer.findElement(By.xpath("//*[@formcontrolname='assessment']")));
		assessment.selectByValue("2");
		
		modalContainer.findElement(By.id("code-content")).sendKeys("Test Comments");
		
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\1.jpg");
		Thread.sleep(2000);
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\2.jpg");
		modalContainer.findElement(By.xpath("//input[@id='fileDropRef']")).sendKeys("C:\\Users\\premk\\Downloads\\Files\\new.txt");
		Thread.sleep(4000);
		modalContainer.findElement(By.xpath("//*[text()='Submit ']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=' Upload successful ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Upload successful ']")).getText());
		//Assert.assertTrue(false);
	}

}
