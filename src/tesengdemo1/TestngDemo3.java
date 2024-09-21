package tesengdemo1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngDemo3 
{
	 @Test
		public void funA()																					
		{
			System.out.println("fun of TestngDemo3");
		}
		@Test
		public void funB()
		{
			System.out.println("funD of TestngDemo3");
		}
		@Test
		public void funC()
		{
			System.out.println("funA of TestngDemo3");
			//throw new Exception();
			throw new SkipException("Testing skip Demo");
		}
		@Test(enabled=false)
		public void funD()
		{
			System.out.println("funC of TestngDemo3");
		}


}
