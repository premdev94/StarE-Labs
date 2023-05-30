package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Adminlogin;

public class Assigncurriculum extends Adminlogin {
	
	@Test
	public void curriculumassign() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Curriculum ']").click();
		Thread.sleep(2000);
		Select display = new Select(driver.findElementByXPath("//*[@aria-label='Default select example']"));
		display.selectByValue("10");
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[text()='Last']").click();
		driver.findElementByXPath("//table/tbody/tr[last()]/td[9]/div/button").click();
		
		driver.findElement(By.xpath("//input[@formcontrolname='student_search']")).sendKeys("20cse01");
		Thread.sleep(2000);
		driver.findElementByName("students").click();
		driver.findElementByXPath("//*[text()='Assign']").click();
		
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=' Students are successfully assigned ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Students are successfully assigned ']")).getText());
	}

}
