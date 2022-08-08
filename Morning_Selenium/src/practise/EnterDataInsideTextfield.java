package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInsideTextfield {

	public static void main(String[] args) throws Throwable
	{
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/100tx/Desktop/Basic.html");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("Shraddha");
		//driver.findElement(By.id("a1")).sendKeys("SHraddha");
		//driver.findElement(By.className("c1")).sendKeys("Shraddha");
		
	}

}
