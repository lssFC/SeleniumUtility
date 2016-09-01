package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadImage {
	
	static String emailAddress="compucrack";
	static String password="compucrack";

	public static void main(String[] args) {

				
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/admin/login.php");
		
		driver.findElement(By.name("username")).sendKeys(emailAddress);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='adminAppMenu']/h3[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='adminAppMenu']/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='tdb2']/span[2]")).click();
		
		driver.findElement(By.name("products_name[1]")).sendKeys("Mouse");
		driver.findElement(By.name("products_price")).sendKeys("100");
		
		driver.findElement(By.name("products_quantity")).sendKeys("50");
		driver.findElement(By.name("products_image")).sendKeys("D:\\Batches\\B107\\Images\\Test.jpg");
		
		driver.findElement(By.xpath("//*[@id='tdb1']")).click();
		
		
	}

}
