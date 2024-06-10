package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Sujata");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

}
