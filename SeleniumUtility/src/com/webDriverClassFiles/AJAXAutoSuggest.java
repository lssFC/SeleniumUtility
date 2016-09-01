package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AJAXAutoSuggest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.clickindia.com/");

		driver.findElement(By.id("ajx_hdr_srch")).sendKeys("computer");
		Thread.sleep(2000);
		
			
		String startpath = "//*[@id='ajax_search_list']/div[";
		String endXpath = "]";
		
		int count=1;
		
		
		try{
		
			while(true){
			
			
			String text = driver.findElement(By.xpath(startpath+count+endXpath)).getText();
			System.out.println(text);
			count++;
			
			}
			
			
		}catch(Throwable t){
			
			System.out.println(t.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
