package prac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://myudyogaadhar.org/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("office_state"));
		Select dropdown = new Select(element);
		//dropdown.selectByVisibleText("GUJARAT");
		//dropdown.selectByValue("KERALA");
		dropdown.selectByIndex(4);
		if(dropdown.isMultiple()==true) {
			System.out.println("DropDown is multiple");
		}
		else {
			System.out.println("DropDown is not multiple");
		}
		
		List <WebElement> dropdownList = dropdown.getOptions();
		for(WebElement el: dropdownList) {
			System.out.println(el.getText());
		}
		
	}

}
