package webDriverClassFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropping {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameBox = driver.findElement(By.xpath("//*[@id='content']/iframe"));

		driver.switchTo().frame(frameBox);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));

		String beforeDropping = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destination).build().perform();
		
		String afterDropping = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();

		System.out.println("Text before dropping is:->"+beforeDropping);
		System.out.println("Text after dropping is:->"+afterDropping);
		
		if(!beforeDropping.equals(afterDropping)){
			
			System.out.println("Pass");
			
		}else{
			
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
