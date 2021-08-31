package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	By lvalue1=By.xpath("lbl_val_1");
	By lvalue2=By.xpath("lbl_val_2");
	By lvalue3=By.xpath("lbl_val_3");
	By lvalue4=By.xpath("lbl_val_4");
	By lvalue5=By.xpath("lbl_val_5");
	By tvaluel=By.xpath("lbl_ttl_val");
	
	By tvalue1=By.xpath("txt_val_1");
	By tvalue2=By.xpath("txt_val_2");
	By tvalue3=By.xpath("txt_val_4");
	By tvalue4=By.xpath("txt_val_5");
	By tvalue5=By.xpath("txt_val_6");
	By tvaluet=By.xpath("txt_ttl_val");
	
	public WebElement label1()
	{
		return driver.findElement(lvalue1);
	}
	public WebElement label2()
	{
		return driver.findElement(lvalue2);
	}
	public WebElement label3()
	{
		return driver.findElement(lvalue3);
	}
	public WebElement label4()
	{
		return driver.findElement(lvalue4);
	}
	public WebElement label5()
	{
		return driver.findElement(lvalue5);
	}
	public WebElement totallabel()
	{
		return driver.findElement(tvaluel);
	}
	
	
	public WebElement text1()
	{
		return driver.findElement(tvalue1);
	}
	
	public WebElement text2()
	{
		return driver.findElement(tvalue2);
	}
	
	public WebElement text3()
	{
		return driver.findElement(tvalue3);
	}
	
	public WebElement text4()
	{
		return driver.findElement(tvalue4);
	}
	
	public WebElement text5()
	{
		return driver.findElement(tvalue5);
	}
	public WebElement totaltext()
	{
		return driver.findElement(tvaluet);
	}
	
	
}
