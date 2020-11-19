package Tcs.Test.Login.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {
public static void main(String[]args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium alloption demo\\selfb exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement amaz = driver.findElement(By.id("twotabsearchtextbox"));
		amaz.sendKeys("iphone");
		Robot am = new Robot();
		am.keyPress(KeyEvent.VK_DOWN);
		am.keyRelease(KeyEvent.VK_DOWN);
		am.keyPress(KeyEvent.VK_ENTER);
		am.keyRelease(KeyEvent.VK_ENTER);
		
}
}


