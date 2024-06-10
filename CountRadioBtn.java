package prac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.manage().window().maximize();
		List<WebElement> radiobtn = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total number of radio" + radiobtn.size());

	}

}
