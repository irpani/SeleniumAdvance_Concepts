package webTable_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable_with_Specific_condition {
	WebDriver driver;

	@Test
	public void getRows() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\Automation\\chromedriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		Thread.sleep(5000);
		List<WebElement> getRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		List<WebElement> getcol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("No Of rows..." + getRow.size());
		System.out.println("No of coloumns..." + getcol.size());

		for (int i = 2; i <= getRow.size() + 1; i++) {
			for (int j = 1; j <= getcol.size(); j++) {
				// System.out.println(i+">>>>"+j+">> "+
				// driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText());
				String getText = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				// System.out.println(getText);
				if (getText.equals("	Mexico")) {
					System.out.println("matched" + getText);
					break;
				}

			}
		}

		driver.close();
	}
}
