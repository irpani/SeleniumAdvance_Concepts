package webTable_1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetRowsAnsCells {

	public static List<String> getRowData(WebDriver driver, By locator, int rownum) {
		List<String> rowdata = new ArrayList<String>();
		WebElement table = driver.findElement(locator);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cells = rows.get(rownum).findElements(By.tagName("td"));

		for (WebElement cell : cells) {
			rowdata.add(cell.getText());
		}
		return rowdata;
	}

	public static String getCellData(WebDriver driver, By locator, int rownum, int colnum) {
		WebElement table = driver.findElement(locator);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cells = rows.get(rownum).findElements(By.tagName("td"));
		String data = cells.get(colnum).getText();

		return data;
	}

}