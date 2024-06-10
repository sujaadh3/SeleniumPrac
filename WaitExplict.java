package prac1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExplict {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.in/");	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Stopwatch watch = null;	
		try {
			watch = Stopwatch.createStarted();
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("HELLO")));
		element.click();
		}
		catch(Exception e ) {
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
	}
}
}
