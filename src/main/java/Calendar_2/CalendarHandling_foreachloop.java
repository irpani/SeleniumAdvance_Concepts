package Calendar_2;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarHandling_foreachloop {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://redbus.in");
		// dr.findElement(By.xpath("//label[text()='Onward Date']")).click();
		// dr.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]")).click();//sendKeys(Keys.ENTER);
		dr.findElement(By.xpath("//input[@id='onward_cal']")).click();
		List<WebElement> li = dr.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table[1]//td"));

		for (WebElement el : li) {
			String date = el.getText();
			if (date.equals("28")) {
				el.click();

				System.out.println("Date is selected " + date);
				break;

			}
		}
	}

}