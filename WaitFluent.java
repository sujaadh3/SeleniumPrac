package prac1;

import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.in/");	
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver) //create the object of fluentdriver
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))//mention polling frequency
		.withMessage("This is custom message")
		.ignoring(NoSuchElementException.class);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("HELLO")));
		element.click();
		
			}

}
