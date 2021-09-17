package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		String text = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).getText();
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys(text+"my value");
		String text2 = driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		String attribute = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).getAttribute("disabled");
		if(attribute.equals("true"))
		{
			System.out.println("The input field is diabled");
		}
		else
		{
			System.out.println("The input field is enabled");

		}
		driver.close();
		
		
	}

}
