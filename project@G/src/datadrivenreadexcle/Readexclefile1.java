package datadrivenreadexcle;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readexclefile1 {
	ChromeDriver driver= new ChromeDriver(); //Global variable declaration
	@Test(dataProvider = "testdata") // annotation
public void Linkedin(String username, String password) throws InterruptedException	
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
	ChromeDriver driver=new ChromeDriver();
	//Step2:Maximize Browser
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/home");
	driver.findElement(By.id("session_key")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("session_password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		Thread.sleep(2000);
		driver.close();			
}
	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() throws IOException {

	
		Dataexcelfile1 config = new Dataexcelfile1("C:\\Excel Book\\sheet8.xlsx");
		int rows = config.getRowCount(0);
		  
		 Object[][] credentials = new Object[rows][2];
		 
		for(int i=0;i<rows;i++)
		 {
		 credentials[i][0] = config.getData(0, i, 0);
		 credentials[i][1] = config.getData(0, i, 1);
		 }
		  
		 return credentials; 
	}	
	

}
