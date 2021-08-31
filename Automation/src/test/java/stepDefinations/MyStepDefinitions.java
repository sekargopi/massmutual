package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base{
	public WebDriver driver;
	HomePage h;


    @Given("^User is on accounts page$")
    public void user_is_on_accounts_page() throws Throwable {
        driver= Base.getDriver();
       }
  

    @When("^the page is loaded$")
    public void the_page_is_loaded(String strArg1) throws Throwable {
         h=new HomePage(driver);
       	Thread.sleep(3000);
       }
    
    @Then("^verify all the values are getting displayed$")
    public void values_are_displayed(String strArg1) throws Throwable {
   Assert.assertTrue( h.label1().isDisplayed());
   Assert.assertTrue( h.label2().isDisplayed());
   Assert.assertTrue( h.label3().isDisplayed());
   Assert.assertTrue( h.label4().isDisplayed());
   Assert.assertTrue( h.label5().isDisplayed());
     }
   

    @And("^values are greater than zero$")
    public void values_are_greater_than_zero() throws Throwable {
    Assert.assertTrue( Integer.valueOf(h.text1()).isGreaterThan(0));
    Assert.assertTrue( Integer.valueOf(h.text2()).isGreaterThan(0));
    Assert.assertTrue( Integer.valueOf(h.text3()).isGreaterThan(0));
    Assert.assertTrue( Integer.valueOf(h.text4()).isGreaterThan(0));
    Assert.assertTrue( Integer.valueOf(h.text5()).isGreaterThan(0));
    }

    @Then("^verify sum of value matches total balance$")
    public void total_balance_check() throws Throwable {
   String S1=h.text1().gettext();
   int I1=Integer.parseInt(S1.replace("$", ""));
   String S2=h.text1().gettext();
   int I2=Integer.parseInt(S2.replace("$", ""));
   String S3=h.text1().gettext();
   int I3=Integer.parseInt(S3.replace("$", ""));
   String S4=h.text1().gettext();
   int I4=Integer.parseInt(S4.replace("$", ""));
   String S5=h.text1().gettext();
   int I5=Integer.parseInt(S5.replace("$", ""));
   
   int sum=I1+I2+I3+I4+I5;
   
   String S1=h.totaltext().gettext();
   int I6=Integer.parseInt(S6.replace("$", ""));
   
   Assert.assertTrue(I6, sum);
   
     }
    
    @Then("^verify all values are associated with dollar symbol$")

    public void values_contains_dollar() throws Throwable {
    		    Assert.assertTrue(h.text1().contains('$'));
    		    Assert.assertTrue(h.text2().contains('$'));
    		    Assert.assertTrue(h.text3().contains('$'));
    		    Assert.assertTrue(h.text4().contains('$'));
    		    Assert.assertTrue(h.text5().contains('$'));
    		    }

}