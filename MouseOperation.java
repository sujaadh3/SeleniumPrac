package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		//WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));	
		//WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));	
		WebElement button = driver.findElement(By.xpath("//button[@id='iQ6Zq']"));
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		//act.contextClick(button).perform();
	}

}
