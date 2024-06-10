package prac1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitImplict { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.in/");
		
		//ADD IMPLICT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		try {
			watch = Stopwatch.createStarted();
		driver.findElement(By.linkText("HELLO")).click();	
		}
		catch(Exception e ) {
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}
		
		

	}

}
