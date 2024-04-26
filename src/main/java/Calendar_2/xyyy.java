package Calendar_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyyy {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.findElement(By.id("second_date_picker")).click();
		selectDate(driver, "15/Mar/2021", "dd/MMM/yyyy");
	}

	public static void selectDate(WebDriver driver, String targetDate, String dateFormat) throws Exception {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat targetDateFormat = new SimpleDateFormat(dateFormat);
		Date formattedTargetDate;
		try {
			targetDateFormat.setLenient(false);
			formattedTargetDate = targetDateFormat.parse(targetDate);
			calendar.setTime(formattedTargetDate);

			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth = calendar.get(Calendar.MONTH);
			int targetYear = calendar.get(Calendar.YEAR);

			String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

			int actualMonth = calendar.get(Calendar.MONTH);
			int actualYear = calendar.get(Calendar.YEAR);

			while (targetMonth < actualMonth || targetYear < actualYear) {
				driver.findElement(By.className("ui-datepicker-prev")).click();
				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
			}

			while (targetMonth > actualMonth || targetYear > actualYear) {
				driver.findElement(By.className("ui-datepicker-next")).click();
				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
			}

			driver.findElement(By.xpath(
					"//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="
							+ targetDay + "]"))
					.click();

		} catch (ParseException e) {
			throw new Exception("Invalid date is provided, please check input date");
		}
	}
}