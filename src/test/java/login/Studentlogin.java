package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Studentlogin {
	
	public static ChromeDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void loginstarelabs() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.digilabs.ai/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_name")).sendKeys("20cse01");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev.digilabs.ai/labs");
	}
	
	@AfterTest
	public void signoutstarelabs() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/app-root/app-features/div/div[1]/app-student-header/div[1]/div/div[2]/div[4]/img")).click();
		 driver.findElement(By.xpath("//*[text()='Logout ']")).click();
		 driver.close();
	}
}
