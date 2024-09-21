package webelementshandling;

import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice 
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/login/");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@id='loginbutton']"));


		boolean actualloginbuttonisdisplayed=loginbutton.isDisplayed();
		boolean expectedloginbuttondisplayed=false;

		if(actualloginbuttonisdisplayed==expectedloginbuttondisplayed)
		{
			System.out.println("login buttton is displayed");
		}
		else
		{

			System.out.println("login buttton is not displayed");

		}
		boolean actualloginbuttonisenabled=loginbutton.isEnabled();
		boolean expectedloginbuttonenabled=true;

		if(actualloginbuttonisenabled==expectedloginbuttonenabled)
		{
			System.out.println("login buttton is enabled");
		}
		else

			System.out.println("login buttton is not enabled");
		boolean actualloginbuttonisselected=loginbutton.isSelected();
		boolean expectedloginbuttonselected=true;

		if(actualloginbuttonisselected==expectedloginbuttonselected)
		{
			System.out.println("login buttton is selected");
		}
		else

			System.out.println("login buttton is not selected");


	}


}


