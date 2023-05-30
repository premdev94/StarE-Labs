package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Gradesettingsdelete extends Adminlogin {
	
	@Test
	public void deletegradesettings() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Scorecard ']").click();
		
		driver.findElementByXPath("//span[text()='Grade Setting']").click();
		
        Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//form/div[2]/div[last()]/div/div[4]/button").click();
		
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("//button[text()='Update ']").click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=' Grade saved successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Grade saved successfully ']")).getText());
		
		
	}

}
