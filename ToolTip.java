package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		String expectTitle = "Sign Up for";
		if(actualTitle.equals(expectTitle)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		
	}

}
