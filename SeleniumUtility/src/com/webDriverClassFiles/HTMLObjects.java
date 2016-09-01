package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLObjects {

	public static void main(String[] args) throws InterruptedException {

		String username = "info@unicodetechnologies.in";
		String password = "unicode";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		
		WebElement loginLink = driver.findElement(By.linkText("log yourself in"));
		loginLink.click();

		//driver.findElement(By.linkText("log yourself in")).click();
		
		driver.findElement(By.name("email_address")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.id("tdb5")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		driver.findElement(By.xpath("//*[@id='tdb4']/span[2]")).click();
		
		driver.findElement(By.partialLinkText("create an ")).click();
		
		driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		
		
		WebElement country = driver.findElement(By.name("country"));
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		
		driver.findElement(By.name("newsletter")).click();
		driver.close();
	
	}

}
