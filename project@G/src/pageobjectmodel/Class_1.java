package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Class_1 {
	WebDriver driver;

	@FindBy(name="radiooptions")
	WebElement method1;

	@FindBy(xpath="//input[@type=\"tel\"]")
	WebElement method2;
	
	@FindBy(id="checkbox1")
	WebElement method3;
	
	
	
	Class_1(WebDriver d	)
	{
		driver=d;
		PageFactory.initElements(d,this);
		}
	public void method1()
	{
		method1.click();
		}


	public void  method2()
	{
		method2.sendKeys("9963834574");
		}


	public void  method3()
	{
		method3.click();
		}
		
	
	
	
}
