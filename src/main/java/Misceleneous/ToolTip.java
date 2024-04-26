package Misceleneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static WebDriver driver;

	public static void main(String[] args) {
		// Set system properties for geckodriver This is required since Selenium 3.0
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips/");
		System.out.println("Tooltip web Page Displayed");
		driver.manage().window().maximize();

		// Get element for which we need to find tooltip
		WebElement ageTextBox = driver.findElement(By.id("age"));

		// Get title attribute value
		String tooltipText = ageTextBox.getAttribute("title");
		System.out.println("Retrieved tooltip text as :" + tooltipText);

		// Verification if tooltip text is matching expected value
		if (tooltipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")) {
			System.out.println("Pass : Tooltip matching expected value");
		} else {
			System.out.println("Fail : Tooltip NOT matching expected value");
		}

		// Close the main window
		driver.close();
	}
}
