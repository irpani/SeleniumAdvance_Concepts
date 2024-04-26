package Sikuli_AutoIt_Robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassScreenshot {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Robot robot = new Robot();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dim);
		BufferedImage from = robot.createScreenCapture(rectangle);
		File to = new File("robotclass.png");
		ImageIO.write(from, "png", to);

		driver.close();

	}

}