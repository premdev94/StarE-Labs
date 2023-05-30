package Adminlogintestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Adminlogin;

public class Learningpath extends Adminlogin {
	
	@Test
	public void curriculumlearningpath() throws InterruptedException
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
		
		driver.findElement(By.xpath("//*[text()=' Learning Path ']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys("Main Path-1");
		driver.findElementByXPath("(//*[text()=' + '])[2]").click();
		driver.findElementByXPath("(//input[@placeholder='Title'])[2]").sendKeys("Sub Path-1");
		
		driver.findElementByXPath("(//*[text()=' + '])[1]").click();
		
		driver.findElementByXPath("(//input[@placeholder='Title'])[3]").sendKeys("Main Path-2");
		driver.findElementByXPath("(//*[text()=' + '])[3]").click();
		driver.findElementByXPath("(//input[@placeholder='Title'])[4]").sendKeys("Sub Path-2-1");
		driver.findElementByXPath("(//*[text()=' + '])[3]").click();
		driver.findElementByXPath("(//input[@placeholder='Title'])[5]").sendKeys("Sub Path-2-2");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//*[text()=' + '])[1]").click();
		driver.findElementByXPath("(//input[@placeholder='Title'])[6]").sendKeys("Main Path-3");
		driver.findElementByXPath("(//*[text()=' + '])[4]").click();
		driver.findElementByXPath("(//input[@placeholder='Title'])[7]").sendKeys("Sub Path-3-1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=' Save ']")).click();
		
		driver.findElement(By.xpath("//*[text()=' Learning Path saved successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Learning Path saved successfully ']")).getText());
	} 

}
