package webDriverClassFiles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowTabbingBrowsing {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://hdfcbank.com/");
		
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iter = windowID.iterator();
		
		String mainWinID = iter.next();
		String popWinID = iter.next();
		
		driver.switchTo().window(popWinID);
		
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/ul/li[1]/a")).click();
		windowID = driver.getWindowHandles();
		iter = windowID.iterator();
		
		iter.next();
		iter.next();
		String tabWinID = iter.next();
		
		driver.switchTo().window(tabWinID);
		
		driver.findElement(By.xpath("//html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[4]/td/ul[2]/li[1]/a")).click();
		
		windowID = driver.getWindowHandles();
		iter = windowID.iterator();
		
		iter.next();
		iter.next();
		iter.next();
		String tabWinID2 = iter.next();
		
		driver.switchTo().window(tabWinID2);
		/*
		driver.close();
		driver.switchTo().window(tabWinID);
		driver.close();
		driver.switchTo().window(popWinID);
		driver.close();
		driver.switchTo().window(mainWinID);
		driver.close();
		*/
		
		driver.quit();
		
	}

}
