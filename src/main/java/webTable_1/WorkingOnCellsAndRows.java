package webTable_1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnCellsAndRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rnum = 3;
		int cnum = 2;
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

		String data = "2;Landing Page;Mike Trout;completed";
		String[] arraydata = data.split(";");
		List<String> expdata = Arrays.asList(arraydata);

		List<String> actdata = GetRowsAnsCells.getRowData(driver, By.id("task-table"), 2);
		if (expdata.equals(actdata)) {
			System.out.println("Row verified Successfully");
		}

		String expecdata = "Browser Issues";
		String actcelldata = GetRowsAnsCells.getCellData(driver, By.id("task-table"), 6, 1);
		if (expecdata.equals(actcelldata)) {
			System.out.println("Cell Verified Successfully");
		}

		driver.close();

		// for all rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

		// single row
		WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + rnum + "]"));

		// column
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr[" + rnum + "]/td"));

		WebElement cell = driver
				.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + rnum + "]/td[" + cnum + "]"));
	}

}