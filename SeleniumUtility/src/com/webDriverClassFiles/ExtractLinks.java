package webDriverClassFiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		
		WebElement catBox = driver.findElement(By.xpath("//*[@id='columnLeft']/div[1]/div[2]"));
		List<WebElement> catValues = catBox.findElements(By.tagName("a"));
		
		System.out.println(catValues.size());
		for(int count=0;count<catValues.size();count++){
			
			System.out.println(catValues.get(count).getText());
			
			
		}
	}

}
