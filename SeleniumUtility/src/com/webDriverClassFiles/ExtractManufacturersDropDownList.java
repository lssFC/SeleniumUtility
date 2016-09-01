package webDriverClassFiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractManufacturersDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
	
		WebElement manuBox = driver.findElement(By.xpath("//*[@id='columnLeft']/div[2]/div[2]/form/select"));
		List<WebElement> manuValues = manuBox.findElements(By.tagName("option"));
		
		for(int count=0;count<manuValues.size();count++){
			
			System.out.println(manuValues.get(count).getText());
		}
		
		
	}

}
