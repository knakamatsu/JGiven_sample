package main;


import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SeleniumSample.class, SeleniumSample2.class})
public class SeleniumSuite {
	@ClassRule
	public static WebDriverWrapper wDriver = new WebDriverWrapper();

}
