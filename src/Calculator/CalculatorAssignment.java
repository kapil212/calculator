package Calculator;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorAssignment {
	WebDriver driver;
	@BeforeTest
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test(priority=1)
	public void Multiplication() throws InterruptedException {
		driver.get(" https://www.calculator.net/");
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();//*
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();//5
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();//5
	
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();//ac
	}
	@Test(priority=2)
	public void Division() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();//0
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();//0
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();//0
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();//[/]
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();//0
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();//0
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
	}
	
	@Test(priority=2)
	public void addition() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();//-
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();//+
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();//5
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();//5
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		
		
	}
	
	@Test(priority=3)
	public void Subtraction() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();//8
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();//-
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[1]/div/div[5]/span[1]")).click();// (
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();//-
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();//0
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();//9
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();//8
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[1]/div/div[5]/span[2]")).click();// )
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		
	}
	
		
		
	}
	
	


