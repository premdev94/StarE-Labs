package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Studentcreate extends Adminlogin {
	
	@Test
	public void createstudent() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()='Student Management']").click();
		
		driver.findElementByXPath("//button[text()='Add Students']").click();
		
        Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(2000);
		
		modalContainer.findElement(By.id("first_name_001")).sendKeys("A First Name");
		modalContainer.findElement(By.id("last_name_001")).sendKeys("A Last Name");
		modalContainer.findElement(By.id("register_number")).sendKeys("AFN0014");
		modalContainer.findElement(By.id("mobile_number")).sendKeys("1020304057");
		modalContainer.findElement(By.id("email")).sendKeys("afirstlast14@gmail.com");
		Select department=new Select(modalContainer.findElement(By.id("department")));
		department.selectByValue("ECE");
		modalContainer.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(3000);
		
		  
		 driver.findElement(By.xpath("//*[text()=' Student created successfully ']")).isDisplayed();
		 System.out.println(driver.findElement(By.xpath("//*[text()=' Student created successfully ']")).getText());
	}

}
