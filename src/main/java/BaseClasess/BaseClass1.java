package BaseClasess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	static WebDriver driver;
	
	
	
	public static WebDriver GEtBroweser(String browser) {
	if(driver==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	return driver;
		
	
	}

}
