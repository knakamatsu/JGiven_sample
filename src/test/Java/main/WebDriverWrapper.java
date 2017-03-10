package main;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWrapper extends TestWatcher {
	private static int execute_counter;
	private static WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	@Override
	protected void starting(Description description) {
		super.starting(description);

		if(execute_counter == 0){
			System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		execute_counter++;

	}
	@Override
	protected void finished(Description description) {
		super.finished(description);

		execute_counter--;
		if (driver != null && execute_counter == 0) {
			driver.quit();
		}
	}




}
