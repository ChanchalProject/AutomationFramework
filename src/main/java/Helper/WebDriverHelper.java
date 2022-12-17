package Helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop = new Properties();

	static {
		try {
			FileInputStream file = new FileInputStream(
					"D:\\Automation\\AutomationFramework\\Config\\config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}
	}

	public static void launch() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("incognito");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	public WebElement waitForExpectedElement(final By by, long waitTimeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (NoSuchElementException | TimeoutException e) {

			return null;
		} catch (StaleElementReferenceException e) {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
	}

	public void hoverOnElement(By by) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(by)).build().perform();
	}
}