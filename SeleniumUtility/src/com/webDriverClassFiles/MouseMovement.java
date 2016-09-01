package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.amway.com/");
		
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id='menu']/li[1]/a"));
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='menu']/li[1]/div/div[3]/div[2]/ul/li[2]/a"));

		Actions ac = new Actions(driver);
		ac.moveToElement(mainMenu).build().perform();
		
		subMenu.click();
		
		
	}

}
