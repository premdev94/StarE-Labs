package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Groupdelete extends Adminlogin {
	
	@Test
	public void deletegroup() throws InterruptedException
	{
		
		driver.findElementByXPath("//span[text()='Student Management']").click();
		
		driver.findElementByXPath("//p[text()='Group']").click();
		
		String Beforecount=driver.findElementByXPath("//div[@class='total-records']").getText();
		System.out.println("Before Delete:"+Beforecount);
		
		Thread.sleep(2000);
		
		Select display=new Select(driver.findElementByXPath("//select[@aria-label='Default select example']"));
		display.selectByValue("10");
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[text()='Last']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//table/tbody/tr[last()]/td[4]/img[2]").click();
		Thread.sleep(2000);
		
		WebElement popupmodal=driver.findElementByClassName("modal-content");
		popupmodal.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=' Group deleted successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Group deleted successfully ']")).getText());
		
		Thread.sleep(2000);
		
		String Aftercount=driver.findElementByXPath("//div[@class='total-records']").getText();
		System.out.println("After Delete:"+Aftercount);
		
	}

}
