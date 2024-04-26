package RemoteWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificate_Handling {

	public static void main(String[] args) {

		// DesiredCapabilities cap = new DesiredCapabilities();
		// DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		// cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// Firefox Certificates issue and accept

		// System.setProperty("webdriver.gecko.driver",
		// "D://Selenium//softwares//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
		// System.setProperty("webdriver.ie.driver",
		// "D://Selenium//softwares//IEDriverServer.exe");

		// ProfilesIni pf = new ProfilesIni();
		// FirefoxProfile profile = pf.getProfile("default");// new FirefoxProfile();
		// profile.setAcceptUntrustedCertificates(true);
		// profile.setAssumeUntrustedCertificateIssuer(false);

		// WebDriver dr = new FirefoxDriver(profile);
		//
		// WebDriver dr = new InternetExplorerDriver(cap);

		// Class ProfilesIni details
		// ProfilesIni allProfiles = new ProfilesIni();
		// Use FirefoxProfile Constructor
		// FirefoxProfile myProfile = allProfiles.getProfile("NewOne");
		// myProfile.setAcceptUntrustedCertificates(true);
		// myProfile.setAssumeUntrustedCertificateIssuer(false);
		// WebDriver Driver = new FirefoxDriver(myProfile);

		// For Chrome
		DesiredCapabilities cap = new DesiredCapabilities();
		// DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		WebDriver dr = new ChromeDriver(cap);
		dr.get("https://cacert.org/");

	}

}