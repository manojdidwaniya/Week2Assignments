package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.getTitle();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();

	}

}
