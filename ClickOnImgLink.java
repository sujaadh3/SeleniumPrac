package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnImgLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
	}

}
