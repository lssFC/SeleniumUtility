package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFrame {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frameBox = driver.findElement(By.xpath("//*[@id='content']/iframe"));

		driver.switchTo().frame(frameBox);
		WebElement obj = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		System.out.println(obj.getLocation().x);
	}

}
