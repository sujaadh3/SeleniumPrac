package prac1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//wait 10 sec
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//find hyperlink
		List <WebElement> linkList = driver.findElements(By.id("a"));
		//save the response code in resCode variable
		int resCode = 200;
		int brokenLinkCnt = 0;
		System.out.println("Total link on Page" + linkList.size());
		for(WebElement element: linkList) {
			//capture the url
			String url = element.getAttribute("href");
			
			//under the try and catch we can create the url object
			try {
				URL urlLink = new URL(url);
				//open all the urllink by using httpurlconnection 
				//sent the request for all connection
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				//connect the connection
				huc.connect();
				resCode = huc.getResponseCode();
				if(resCode >= 400) {
					System.out.println(url + "broken link");
					brokenLinkCnt++;
				}
				else {
					
				}
			}
			catch(MalformedURLException e) {
				
			}
			catch(Exception e) {
				
			}
		
		}    
		//after the for each loop printing the total broken link
		System.out.println("Total broken Link" + brokenLinkCnt);
	}

}
