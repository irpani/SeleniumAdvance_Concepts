package Misceleneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCertificationHandling {
	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions();
		// Accept SSL certificates
		options.setAcceptInsecureCerts(true);
		// Launch Chrome browser with options
		WebDriver driver = new ChromeDriver(options);
		// Perform actions after accepting SSL certificates
		// ...
		// Close the browser
		driver.quit();
	}
}
