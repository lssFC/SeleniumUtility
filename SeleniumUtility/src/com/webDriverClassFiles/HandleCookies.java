package webDriverClassFiles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCookies {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		System.out.println("--------Cookies before login--------");
		Set<Cookie> myCookies = driver.manage().getCookies();

		for(Cookie ck:myCookies){
			
			System.out.println(ck.getDomain()+"   "+ck.getName()+"   "+ck.getPath()+"   "+ck.getValue());
		}
		
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys("info@unicodetechnologies.in");
		driver.findElement(By.name("password")).sendKeys("unicode");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

		
		System.out.println("--------Cookies after login--------");
		myCookies = driver.manage().getCookies();

		for(Cookie ck:myCookies){
			
			System.out.println(ck.getDomain()+"   "+ck.getName()+"   "+ck.getPath()+"   "+ck.getValue());
		}
		
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
	}

}
