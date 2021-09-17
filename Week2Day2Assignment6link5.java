package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day2Assignment6link5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement findElement1 = driver.findElement(By.id("dropdown1"));
		Select sel2= new Select(findElement1);
		sel2.selectByValue("2");
		WebElement findElement = driver.findElement(By.name("dropdown2"));
		Select sel1= new Select(findElement);
		sel1.selectByIndex(1);
		WebElement findElement2 = driver.findElement(By.name("dropdown3"));
		Select sel3= new Select(findElement2);
		sel3.selectByVisibleText("UFT/QTP");
		WebElement findElement3 = driver.findElement(By.className("dropdown"));
		Select sel4= new Select(findElement3);
		List<WebElement> options = sel4.getOptions();
		System.out.println("Number of dropdown option is ="+ options.size());
		sel4.selectByIndex(options.size()-1);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
		WebElement findElement4 = driver.findElement(By.xpath("//select[@multiple]"));
		Select sel5= new Select(findElement4);
		sel5.selectByIndex(2);
		
	}
}
