package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment6Link2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Button.html");
		
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		String attribute2 = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(attribute2);
		WebElement findElement = driver.findElement(By.id("size"));
		int width = findElement.getSize().getWidth();
		int height= findElement.getSize().getHeight();
		System.out.println("The height of button is = "+height+ "width of button is = "+width);
		driver.findElement(By.id("home")).click();
	}

}
