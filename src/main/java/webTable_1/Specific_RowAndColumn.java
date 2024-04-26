package webTable_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Specific_RowAndColumn {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		// Particular Elements
		WebElement findElement = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
		String text = findElement.getText();
		System.out.println(text);

	}

}
