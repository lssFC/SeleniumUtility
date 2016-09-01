package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageNavigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/index.php");
		
		driver.findElement(By.linkText("Television->")).click();
		
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div/table/tbody/tr[2]/td[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='tdb4']/span[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.xpath("//*[@id='tdb6']/span[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.xpath("//*[@id='tdb7']/span[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.xpath("//*[@id='tdb8']/span[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		//Select city = new Select(driver.findElement(By.name("ad_city")));
	//city.selectByVisibleText("Ahmedabad");
	}

}
