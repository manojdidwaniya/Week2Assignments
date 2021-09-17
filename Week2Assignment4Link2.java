package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment4Link2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("demosalesmanager");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
		
		WebElement findElement4 = driver.findElement(By.linkText("CRM/SFA"));
		findElement4.click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String findElement5 = driver.findElement(By.xpath("//tr[@class='x-grid3-hd-row']//following::tr[1]/td[1]//a[@class='linktext']")).getText();
		System.out.println(findElement5);
		driver.findElement(By.xpath("//tr[@class='x-grid3-hd-row']//following::tr[1]/td[1]//a[@class='linktext']")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(findElement5);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
//		if(text.equals("No records to display"))
//		{
//			System.out.println("Record deleted successful");
//			
//		}
//		else
//		{
//			System.out.println("Something wrong");
//		}
	}

}
