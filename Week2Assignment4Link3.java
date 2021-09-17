package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment4Link3 {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String xpath1= "//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']//ancestor::div[@class='x-grid3-header']/following-sibling::div//div[@class='x-grid3-row   '][1]//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/following-sibling::td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a";
		String text = driver.findElement(By.xpath(xpath1)).getText();
		//System.out.println();
		driver.findElement(By.xpath(xpath1)).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		if(title.equals("Duplicate Lead"))
		{
			System.out.println("We are on right page");
		}
		else
		{
			System.out.println("Something wrong");
		}
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if(text2.equals(text))
		{
			System.out.println("The person is same");
		}
		else
		{
			System.out.println("Something wrong");
		}
		driver.close();
				
		}
}
