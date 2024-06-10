package prac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("First Page" + driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(" Second page" + driver.getTitle());
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
//driver.close();
		driver.switchTo().window(handles.get(0)); //switch to google s                                                                                                                                                                                                                                           
		System.out.println("First Page" + driver.getTitle());

	}

}
