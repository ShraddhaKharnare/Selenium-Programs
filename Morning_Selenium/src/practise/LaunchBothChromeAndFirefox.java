package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBothChromeAndFirefox {

	public static void main(String[] args) 
	{
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		String key1 = "webdriver.gecko.driver";
		String value1 = "./drivers/geckodriver.exe";
		System.setProperty(key1, value1);
		WebDriver driver1=new FirefoxDriver();
		
		
	}

}
