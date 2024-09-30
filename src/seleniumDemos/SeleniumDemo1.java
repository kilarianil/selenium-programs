package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http//gmai.com");
		driver.findElement(By.id("identified")).sendKeys("RBG technologies");
		System.out.println("Done");
	}

}
