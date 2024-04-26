package Misceleneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dimension {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
		System.out.println(driver.manage().window().getSize());
		// Dimension d = new Dimension(100,200);
		// Resize the current window to the given dimension
		// driver.manage().window().setSize(d);

	}
}
