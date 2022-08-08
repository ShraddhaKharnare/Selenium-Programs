package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
