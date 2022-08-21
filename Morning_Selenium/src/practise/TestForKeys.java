package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForKeys 
{

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/100tx/Desktop/Task.html");
		 WebElement ele1= driver.findElement(By.xpath("//input[@Value='Hello']"));
		 
		 Thread.sleep(2000);
		 ele1.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(2000);
		 ele1.sendKeys(Keys.CONTROL+"c");
		 
		 WebElement ele2= driver.findElement(By.xpath("//input[@Value='Hello']"));
		 ele2.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(2000);
		 ele2.sendKeys(Keys.DELETE);
		 Thread.sleep(2000);
		 ele2.sendKeys(Keys.CONTROL+"v");
		 
		 WebElement ele3= driver.findElement(By.xpath("//input[@Value='Hello']"));
		 ele3.click();
		 driver.close();
		 
		

	}

}
