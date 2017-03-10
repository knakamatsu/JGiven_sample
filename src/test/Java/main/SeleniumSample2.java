package main;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SeleniumSample2 {

	@ClassRule
	public static WebDriverWrapper wDriver = new WebDriverWrapper();

	@Test
	public void test() throws InterruptedException{
		WebDriver driver = wDriver.getDriver();
		driver.get("http://www.google.com");
		assertThat("a", is("a"));

	}

	@Test
	public void test2() throws InterruptedException{
		WebDriver driver = wDriver.getDriver();
		driver.get("http://www.google.com");

	}

	@Test
	public void test3() throws InterruptedException{
		WebDriver driver = wDriver.getDriver();
		driver.get("http://www.google.com");

	}

	@Test
	public void test4() throws InterruptedException{
		WebDriver driver = wDriver.getDriver();
		driver.get("http://www.google.com");

	}

	@Test
	public void test5() throws InterruptedException{
		WebDriver driver = wDriver.getDriver();
		driver.get("http://www.google.com");

	}


}
