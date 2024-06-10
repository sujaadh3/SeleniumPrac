package prac1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method tub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		//WebElement section = driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']"));	
		WebElement section1 =  driver.findElement(By.xpath("h1[normalize-space()='Learn to Code'])[1]"));
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File srcFile = section1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumPrac\\ScreenShot\\Section.png");
		FileUtils.copyFile(srcFile, dest);
	}

}
