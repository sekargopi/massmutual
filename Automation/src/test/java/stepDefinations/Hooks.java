package stepDefinations;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	@After("@RegressionTest")
	public void AfterSeleniumTest()
	{
		driver.close();
	}
		
		