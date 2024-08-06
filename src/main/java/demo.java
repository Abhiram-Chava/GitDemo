import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abhirammetaqa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find friends")).click();
		driver.findElement(By.xpath("//span[text()='All Friends']")).click();
		
		//driver.findElement(By.xpath("//a[@aria-label='Video']")).click();
		driver.findElement(By.cssSelector("a[aria-label='Video']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='x1jx94hy x1lq5wgf xgqcy7u x30kzoy x9jhf4c x78zum5 x6ikm8r x10wlt62 x1n2onr6 xzueoph']//div[@class='xh8yej3']//div[@class='x78zum5 xdt5ytf x1iyjqo2 xdj266r xq8finb xat24cr x16n37ib x1l90r2v']//div//div[@aria-label='More']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@data-visualcompletion=\"css-img\"])[1]")).click();
	
		//WebElement e = driver.findElement(By.id(""));
		
		//System.out.println(e.getText());
		
	}

}
