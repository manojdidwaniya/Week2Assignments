package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment6link6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElement(By.id("yes")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//input[@name='news']"));
		for(WebElement web : findElements)
		{
			if(web.getAttribute("checked") != null)
			{
				System.out.println(Integer.parseInt(web.getAttribute("value"))+1+ " radio button is default selected");
			}
		}
		List<WebElement> findElements2 = driver.findElements(By.name("age"));
		Boolean selected = false;
		for(WebElement web2 : findElements2)
		{
			if(web2.getAttribute("checked") != null)
			{
				selected= true;
			}
		}
		if(selected)
		{
			System.out.println("radio button is already selected");
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]")).click();
		}
		
		driver.quit();
	}

}
