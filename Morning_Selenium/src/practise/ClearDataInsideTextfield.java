package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataInsideTextfield {

	public static void main(String[] args) throws Throwable
	{
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/100tx/Desktop/cssexpre.html");
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("input")).clear();
		//driver.findElement(By.name("n1")).clear();
		//driver.findElement(By.id("a1")).clear();
		//driver.findElement(By.className("c1")).clear();
		driver.findElement(By.cssSelector("input[id='a1']")).clear();
		
		driver.close();
	}

}
