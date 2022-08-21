package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFontSizeofUntextfieldInFB 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
		String font = ele.getCssValue("FontSize");
		System.out.println();
		driver.close();
	}

}
