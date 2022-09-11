package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test(groups= "Functional")
	public void Ft1() 
	{
		Reporter.log("ft1",true);
	}

	@Test(groups= "Smoke")
	public void St1()
	{
		Reporter.log("st1",true);
	}

	@Test(groups="Integration")
	public void It1()
	{
		Reporter.log("It1",true);
	}

	//------------------------------------------------

	@Test(groups= "Functional")
	public void Ft2() 
	{
		Reporter.log("ft1",true);
	}

	@Test(groups= "Smoke")
	public void St2()
	{
		Reporter.log("st1",true);
	}

	@Test(groups="Integration")
	public void It2()
	{
		Reporter.log("It1",true);
	}

	//-------------------------------------------------------

	@Test(groups= "Functional")
	public void Ft3() 
	{
		Reporter.log("ft1",true);
	}

	@Test(groups= "Smoke")
	public void St3()
	{
		Reporter.log("st1",true);
	}

	@Test(groups="Integration")
	public void It3()
	{
		Reporter.log("It1",true);
	}
}
