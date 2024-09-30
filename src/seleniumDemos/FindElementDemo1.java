package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http//gmail.com");

		driver. findElement(By.id("identifierId")).sendKeys("RBG technologies");

		WebElement element1= driver.findElement(By.id("identifierd"));
		element1.sendKeys("RBG technologies");

		By locatortype = By.id("identifierd");
		WebElement element2= driver.findElement(locatortype);
		element2.sendKeys("RBG technologies");

		String locatorvalue =" identifierId";
		By locatortype2 = By.id(locatorvalue);
		String data = "RBG technologies";
		WebElement element3= driver.findElement(locatortype2);
		element3.sendKeys(data);

	}

}
