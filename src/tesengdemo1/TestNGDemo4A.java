package tesengdemo1;

import org.testng.annotations.Test;

public class TestNGDemo4A
{	
	@Test(priority=1)
	public void loginTest()	
	{
		System.out.println("loginTest of TestNGDemo4");
		System.out.println(0/0);
	}
	@Test(priority=2,dependsOnMethods="loginTest")
	public void custumerDetails()
	
	{
		System.out.println("custumerDetails of TestNGDemo4 ");
	
	}
	

}