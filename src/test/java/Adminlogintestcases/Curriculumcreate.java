package Adminlogintestcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import login.Adminlogin;

public class Curriculumcreate extends Adminlogin {
	
	@Test
	public void createcurriculum() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()=' Curriculum ']").click();
		
		driver.findElementByXPath("//button[text()=' Add Curriculum ']").click();
		
        Thread.sleep(3000);
		
		WebElement modalContainer = driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		
		Thread.sleep(2000);
		String curriculamname = RandomStringUtils.randomAlphabetic(8);
		modalContainer.findElement(By.id("curriculamName")).sendKeys(curriculamname);
		String curriculamcode = RandomStringUtils.randomAlphabetic(8);
		modalContainer.findElement(By.id("curriculumCode")).sendKeys(curriculamcode);
		Select labname=new Select(modalContainer.findElement(By.id("lab_name")));
		labname.selectByValue("Apache");
		Thread.sleep(2000);
		Select faculty=new Select(modalContainer.findElement(By.id("faculty_name")));
		faculty.selectByVisibleText("Anil");
		modalContainer.findElement(By.id("students_enrolled")).sendKeys("10");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(date); 
		c.add(Calendar.DATE, 1);
		date = c.getTime();
		String date1= dateFormat.format(date);  
		
		modalContainer.findElement(By.xpath("//input[@formcontrolname='start_date']")).sendKeys(date1);
		modalContainer.findElement(By.xpath("//input[@formcontrolname='end_date']")).sendKeys("31-12-2023");
		Thread.sleep(3000);
		modalContainer.findElement(By.xpath("(//div[@class='lab-planning-custom-checkbox'])[1]")).click();
		modalContainer.findElement(By.xpath("(//b[text()='Add'])[1]")).click();
		Thread.sleep(2000);
		Select slothours=new Select(modalContainer.findElement(By.xpath("//select[@formcontrolname='slot_hours']")));
		slothours.selectByValue("90");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div/div[2]/div/div[2]")).click();
		driver.findElement(By.xpath("//button[text()='Set']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		modalContainer.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=' Curriculum created successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Curriculum created successfully ']")).getText());
		Thread.sleep(2000);

		//modalContainer.findElement(By.xpath("//tbody/tr[1]/td[2]/button/b")).click();
		
		/*List<WebElement> checkboxes=modalContainer.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		 
		for(int i=0; i<checkboxes.size(); i++)
		{
		 checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		
		modalContainer.findElement(By.xpath("//button[text()='Submit']")).click();*/
	}

}
