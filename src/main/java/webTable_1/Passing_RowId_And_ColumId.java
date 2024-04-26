package webTable_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Passing_RowId_And_ColumId {

	private WebElement _webTable;

	public Passing_RowId_And_ColumId(WebElement webTable) {
		set_webTable(webTable);
	}

	public WebElement get_webTable() {
		return _webTable;
	}

	public void set_webTable(WebElement _webTable) {
		this._webTable = _webTable;
	}

	public String getCellData(int rowIdx, int colIdx) {
		List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
		WebElement currentRow = tableRows.get(rowIdx - 1);
		List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
		WebElement cell = tableCols.get(colIdx - 1);
		return cell.getText();
	}

}