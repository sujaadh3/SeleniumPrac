package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[data-test='password'")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[class='btn_action'")).click();
		

	}

}
