package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleKeyBoardEvents {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/index.php");
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys("info@unicodetechnologies.in");
		driver.findElement(By.name("password")).sendKeys("unicode");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		driver.close();
	}

}
