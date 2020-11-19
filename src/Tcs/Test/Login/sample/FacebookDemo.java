package Tcs.Test.Login.sample;

import java.awt.List;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium alloption demo\\selfb exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreateAc = driver.findElement(By.xpath("//a[text()= 'Create New Account']"));
		CreateAc .click();
		
		Thread.sleep(4000);
		WebElement fbDate=driver.findElement(By.id("month"));
		Select select=new Select(fbDate);
		java.util.List<WebElement> options = select.getOptions();
	   for(int i = 0;i <options.size ();i++){
		   WebElement month=options.get(i);
		   String printMonth=month.getText();
		   System.out.println(printMonth);
	   }
	}
	   }


