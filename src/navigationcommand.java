import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationcommand {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		  driver.get("https://www.facebook.com/login/");
		  
//		  Thread.sleep
//		  driver.navigate().back();
	}


}
