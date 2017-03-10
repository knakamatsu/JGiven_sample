package main;

import java.util.function.Consumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
public class samplePage extends Stage<samplePage> {

	@ExpectedScenarioState(required = true)
	WebDriverWrapper webDriverWrapper;
	WebDriver driver;

	public samplePage WebDriver初期化() {
		driver = webDriverWrapper.getDriver();
		PageFactory.initElements(driver, this);
		return self();
	}

	public samplePage gooleページオープン(){
		driver.get("http://www.google.com");
		return self();
	}
	public samplePage 検索欄に値を入力する(String input){
		return self();
	}
	public samplePage 検索を実行する(){
		return self();
	}
	public samplePage 検索結果の情報を確認する(){
		return self();
	}

	public <T> samplePage assertion(T actual , Consumer<T> assertion){
		assertion.accept(actual);
		return self();
	}

	public samplePage Gmailページを開く() {
		// TODO 自動生成されたメソッド・スタブ
		return self();
	}

	public samplePage ログインを実行(String string, String string2) {
		// TODO 自動生成されたメソッド・スタブ
		return self();
	}

	public samplePage 現在gmailページを開いているか確認する() {
		// TODO 自動生成されたメソッド・スタブ
		return self();
	}


}
