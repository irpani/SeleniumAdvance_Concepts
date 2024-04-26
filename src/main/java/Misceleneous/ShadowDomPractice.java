package Misceleneous;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		// driver.findElement(By.id("pizza")).sendKeys("veg pizza");

		// browser --> page --> shadowDOM --> shadow DOM ---> input element

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pizza = (WebElement) js.executeScript(
				"return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");

		pizza.sendKeys("veg pizza");

		//
		driver.get("chrome://settings/");
		WebElement search = (WebElement) js.executeScript(
				"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		search.sendKeys("notification");

	}
}
