import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("C:\\Users\\abhiramchava\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i=0;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.className("buttonN")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
	}

}
