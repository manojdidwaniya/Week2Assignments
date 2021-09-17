package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		//driver.switchTo().activeElement();
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("Didwaniya");
		driver.findElement(By.name("reg_email__")).sendKeys("9724629150");
		driver.findElement(By.id("password_step_input")).sendKeys("M@noj_Testleaf");
		WebElement findElement = driver.findElement(By.id("day"));
		Select selday=new Select(findElement);
		selday.selectByVisibleText("6");
		WebElement findElement2 = driver.findElement(By.id("month"));
		Select selmon=new Select(findElement2);
		selmon.selectByVisibleText("Oct");
		WebElement findElement3 = driver.findElement(By.id("year"));
		Select selyear=new Select(findElement3);
		selyear.selectByVisibleText("1991");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		
		
		

	}

}
