package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames
{

	public static void main(String[] args) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/100tx/Desktop/FrameHandling.html");
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("f1");
	
	WebElement ele=driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(ele);
	driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("123");
	Thread.sleep(3000);
	
	}

}
