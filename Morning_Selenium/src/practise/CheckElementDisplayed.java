package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/100tx/Desktop/Display.html");
        WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
        boolean b=ele.isDisplayed();
        if(b)
        {
        	System.out.println("textbox is diaplyed");
        }
        else {
        	System.out.println("textbox is not displayed");
        }
	}

}
