package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment6link7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		if(findElement.getAttribute("checked") != null)
		{
			System.out.println("selenium is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[3]//input"));
		for(WebElement web : findElements)
		{
			if(web.getAttribute("checked") != null)
			{
				web.click();
			}
		}
		List<WebElement> findElements2 = driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[4]//input"));
		for(WebElement web2 : findElements2)
		{
				web2.click();
			
		}
		
		//driver.quit();
	}

}
