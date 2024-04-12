package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		
		 Class_1 clas=  new Class_1(driver);
		//Step2:Maximize Browser
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		 clas.method1();
		 clas.method2();
		 clas.method3();
		 
	}
}
