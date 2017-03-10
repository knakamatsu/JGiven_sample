package main;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.ClassRule;
import org.junit.Test;

import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit.SimpleScenarioTest;

public class SeleniumSample extends SimpleScenarioTest <samplePage> {

	@ProvidedScenarioState
	@ClassRule
	public static WebDriverWrapper wDriver = new WebDriverWrapper();

	@Test
	public void 検索実行テスト() throws InterruptedException {

		given()
		.WebDriver初期化();

		when()
		.gooleページオープン()
		.検索欄に値を入力する("sample")
		.検索を実行する();

		then()
		.検索結果の情報を確認する()

		.assertion( "Google検索 - うんたら" , (actual) -> assertThat(actual, is("Google検索 - うんたら")))
		.comment("ウィンドウタイトルの文字列が正しいか確認する");

	}

	@Test
	public void Gmailオープン() throws InterruptedException {

		given()
		.WebDriver初期化();

		when()
		.gooleページオープン()
		.Gmailページを開く()
		.ログインを実行("user" , "password");

		then()
		.現在gmailページを開いているか確認する();

	}

}
