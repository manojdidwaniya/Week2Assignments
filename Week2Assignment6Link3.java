package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment6Link3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("Find where am supposed to go without clicking me? link will nevigate to :-"+attribute);
		String attribute2 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");	
		if(attribute2.equals(""))
		{
			System.out.println("The link is broken");
		}
		else
		{
			System.out.println("The link is not broken");
		}
		driver.findElement(By.xpath("//a[text()='Go to Home Page'][2]")).click();
		driver.navigate().back();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		System.out.println("Total link in page = "+findElements.size());
		}

}
