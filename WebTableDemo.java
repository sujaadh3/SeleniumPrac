package prac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String text = driver.findElement(By.xpath("//td[normalize-space()='Centro comercial Moctezuma']")).getText();
		System.out.println(text);
		List <WebElement> rowlist = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("rowlist" + rowlist.size());
		
		List <WebElement> colmlist = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("colmlist" + colmlist.size());
		
		for(int r = 2; r<=rowlist.size(); r++)
		{
			for(int c = 1; c<=rowlist.size(); r++)	{
				
			}
		}


	}

}
