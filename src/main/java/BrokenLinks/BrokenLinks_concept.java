package BrokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks_concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares/geckodriver.exe");

		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.facebook.com");
		List<WebElement> urls = dr.findElements(By.tagName("a"));
		for (WebElement el : urls) {
			String url = el.getAttribute("href");
			BrokenlinkInterface.VerifyLinkActivity(url);
		}

	}

}