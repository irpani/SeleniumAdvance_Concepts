package Sikuli_AutoIt_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Robot robot = null;
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='ssologinlink']")).click();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("username@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password_text']")).sendKeys("password");
		try {
			robot = new Robot();

		} catch (AWTException e) {
			e.printStackTrace();
		}
		// Keyboard Activity Using Robot Class
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
