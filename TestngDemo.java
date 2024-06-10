package prac1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestngDemo {
	@Test
public void verifyPageTitle() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String actuTitle = driver.getTitle();
	String expectTitle = "Google";
	Assert.assertEquals(actuTitle, expectTitle);
	
}
}
