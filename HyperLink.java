package prac1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Total size of element:" + linkElements.size());
		for(WebElement el: linkElements) {
			System.out.println(el.getText());
		}

	}

}
