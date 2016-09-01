package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[2]/table/tbody/tr[1]/td[2]/a[2]")).click();
		
		String text = driver.findElement(By.xpath("//*[@id='bodyContent']/form/div[1]/h1[1]")).getText();
		
		System.out.println(text);
	}

}
