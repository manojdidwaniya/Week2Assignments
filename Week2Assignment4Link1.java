package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment4Link1 {

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
		
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manoj");
		driver.findElement(By.id("lastNameField")).sendKeys("Didwaniya");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Manoj");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Didwaniya");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("We are in testleaf for learning software testing ");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("manoj.didwaniya@gmail.com");
		WebElement findElement5 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sel= new Select(findElement5);
		sel.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
