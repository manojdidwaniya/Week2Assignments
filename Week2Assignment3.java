package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.name("UserFirstName")).sendKeys("Manoj");
		driver.findElement(By.name("UserLastName")).sendKeys("Didwaniya");
		driver.findElement(By.name("UserEmail")).sendKeys("manoj.didwaniya@testleaf.com");
		WebElement findElement = driver.findElement(By.name("UserTitle"));
		Select seltitle = new Select(findElement);
		seltitle.selectByVisibleText("Developer / Software Engineer / Analyst");
		driver.findElement(By.name("CompanyName")).sendKeys("Test Leaf");
		WebElement findElement2 = driver.findElement(By.name("CompanyEmployees"));
		Select selemp = new Select(findElement2);
		selemp.selectByIndex(2);
		driver.findElement(By.name("UserPhone")).sendKeys("9724629150");
		WebElement findElement3 = driver.findElement(By.name("CompanyCountry"));
		Select selcountry = new Select(findElement3);
		selcountry.selectByValue("IN");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[1]")).click();
		driver.close();
		}

}
