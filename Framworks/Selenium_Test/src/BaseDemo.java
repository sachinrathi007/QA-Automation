import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDemo {

	public void BaseDemo() throws InterruptedException {
		// Create a new instance of the Firefox driver
		final String exePath = "C:\\Users\\Sachin\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		final WebDriver driver = new ChromeDriver();

		driver.get("http://Google.com");

		System.out.println("Successfully opened the website www.Google.com");

		Thread.sleep(3000);

		// Close the driver
		driver.quit();
	}

	public static void main(final String[] args) throws InterruptedException {

		final BaseDemo obj = new BaseDemo();
		obj.BaseDemo();

	}

}
