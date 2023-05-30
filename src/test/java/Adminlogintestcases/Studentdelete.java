package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Studentdelete extends Adminlogin {
	
	@Test
	public void deletestudent() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()='Student Management']").click();
		Thread.sleep(3000);
		Select display = new Select(driver.findElementByXPath("//*[@aria-label='Default select example']"));
		display.selectByValue("10");
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[text()='Last']").click();
		driver.findElementByXPath("//table/tbody/tr[last()]/td[1]/div/input").click();
		
		driver.findElementByXPath("//button[text()='Delete Selected']").click();
		
		WebElement modalcontainer=driver.findElementByClassName("modal-content");
		Thread.sleep(2000);
		modalcontainer.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[text()=' student deleted Successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' student deleted Successfully ']")).getText());
		
		/*driver.findElementByXPath("//table/tbody/tr[last()]/td[8]/img[2]").click();
		
		WebElement modalcontainer=driver.findElementByClassName("modal-content");
		Thread.sleep(2000);
		modalcontainer.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=' Student deleted successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Student deleted successfully ']")).getText());*/
	
	}

}