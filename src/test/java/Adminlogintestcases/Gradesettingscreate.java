package Adminlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Gradesettingscreate extends Adminlogin {
	
	@Test
	public void creategradesettings() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Scorecard ']").click();
		
		driver.findElementByXPath("//span[text()='Grade Setting']").click();
		
        Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//form/div[1]/button").click();
		
		driver.findElementByXPath("(//form/div[2]/div[last()]/div/div/div/input)[1]").sendKeys("Grade C");
		driver.findElementByXPath("(//form/div[2]/div[last()]/div/div/div/input)[2]").sendKeys("10");
		driver.findElementByXPath("(//form/div[2]/div[last()]/div/div/div/input)[3]").sendKeys("20");
		
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("//button[text()='Update ']").click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=' Grade saved successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Grade saved successfully ']")).getText());
		
		
	}

}
