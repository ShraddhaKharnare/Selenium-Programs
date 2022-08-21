package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverActionTest {

	public static void main(String[] args) throws Throwable
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='X']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		//act.dragAndDrop(ele, ele);
		//act.doubleClick(ele);
		act.contextClick(ele);
		driver.close();
	}

}
