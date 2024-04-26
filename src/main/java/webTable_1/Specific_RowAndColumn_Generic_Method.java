package webTable_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Specific_RowAndColumn_Generic_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22256/ire-vs-ban-6th-match-windies-and-bangladesh-in-ireland-tri-series-2019");
		// row data and row num
		String xp_start = "//div[@id='innings_1']/div[1]/div[";
		String xp_row = "]/div[";
		String xp_col = "]";
		Thread.sleep(3000L);
		int rownum = 0;
		for (int i = 3; i <= 11; i++) {
			rownum++;
			for (int j = 1; j <= 7; j++) {
				String x = driver.findElement(By.xpath(xp_start + i + xp_row + j + xp_col)).getText();
				System.out.print(x + "        ");
			}
			System.out.println();
		}
		System.out.println("Total number of rows are " + rownum);
		driver.quit();

	}

}