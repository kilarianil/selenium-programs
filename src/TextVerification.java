import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification
{

	public static void main(String[] args) 
	{ 

		WebDriver driver =new ChromeDriver(); 
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S839559475%3A1723102834035038&ddm=0");
    //    driver.findElement(By.xpath());

	}

}
