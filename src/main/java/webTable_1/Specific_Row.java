package webTable_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Specific_Row {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		// All Elements
		List<WebElement> findElement = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]"));
		for (WebElement webElement : findElement) {
			System.out.println(webElement.getText());
		}
	}
}