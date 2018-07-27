package demojava9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void tc() throws Exception {
		System.out.println("demo testing");
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Ranjeet\\Selenium\\Jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		// System.setProperty("webdriver.firefox.marionette",
		// "D:\\Ranjeet\\Selenium\\Jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		Thread.sleep(3000);
		System.out.println("title:" + driver.getTitle());
		driver.quit();

	}
}
