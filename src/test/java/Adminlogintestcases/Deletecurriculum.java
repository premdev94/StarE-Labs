package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Adminlogin;

public class Deletecurriculum extends Adminlogin {
	
	@Test
	public void curriculumdelete() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Curriculum ']").click();
		Thread.sleep(2000);
		Select display1 = new Select(driver.findElementByXPath("//*[@aria-label='Default select example']"));
		display1.selectByValue("10");
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[text()='Last']").click();
		driver.findElementByXPath("//table/tbody/tr[last()]/td[8]/div/div/img").click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=' Curriculum deleted successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Curriculum deleted successfully ']")).getText());
	}

}
