package hw13TestN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UrlTestNg {

	WebDriver driver;

	@BeforeTest
	public void fixUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void linkTest() throws InterruptedException {
		driver.get("https://www.gamestop.com/");
		Thread.sleep(4000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

	//url test
}
