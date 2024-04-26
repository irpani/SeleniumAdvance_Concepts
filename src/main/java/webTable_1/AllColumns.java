package webTable_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllColumns {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		List<WebElement> list = driver.findElements(By.xpath("//table[contains(@class,' notranslate')]//th"));
		int s = list.size();

		for (int i = 0; i < s; i++) {
			String str = list.get(i).getText();
			System.out.println(str);

		}
		// Assert.assertEquals(list.size(), 7);

	}

}
