package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;


	public class Sample
	{
		@Test
		public void test()
		{
			Reporter.log("Sample class not Executed",true); //because it is not pre-fixed with test 

		}

	}



