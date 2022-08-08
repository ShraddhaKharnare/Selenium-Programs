package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws Throwable 
	{
		String key = "webdriver.gecko.driver";
		String value = "./drivers/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
	}

}
