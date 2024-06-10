package prac1;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExexutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		
		//create the javascript instance to use js executorb & typecast the object of the webdriver to javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//eneter text in search box
		//js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Sujata';");
	
	//click on search button
		//WebElement element = driver.findElement(By.xpath("input[@type='submit']"));
		//js.executeScript("arguments[0].click();", element);
		
		
		//refresh browser
		//js.executeScript("history.go(0)");
		
		//getdomain name
		String domain = js.executeScript("return document.deomain;").toString();
		System.out.println("Domain:" + domain);
		
	}

}
