package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Dell\\Downloads\\Math.Ed-415-Fundamentals-of-Mathematics-converted-compressed.pdf");
	
	}

}
