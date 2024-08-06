import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//April 23
		WebElement element = driver.findElement(By.cssSelector("#form-field-travel_comp_date"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		Thread.sleep(500);
		//System.out.println(driver.findElement(By.cssSelector("div[class='flatpickr-month'] span[class='cur-month']")).getText());

		while (!driver.findElement(By.cssSelector("div[class='flatpickr-month'] span[class='cur-month']")).getText()
				.contains("Feb")) {
			System.out.println(driver.findElement(By.cssSelector("div[class='flatpickr-month'] span[class='cur-month']")).getText());
			Thread.sleep(500);
			//System.out.println(driver.findElement(By.cssSelector("div[class='flatpickr-month'] span[class='cur-month']")).getText());
			actions.moveToElement(driver.findElement(By.xpath("//div[@class='flatpickr-month']/span[@class='flatpickr-next-month']"))).click().build().perform();
			Thread.sleep(500);
		}
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='flatpickr-days']//span[@class='flatpickr-day ']"));
//Grab common attribute//Put into list and iterate
		int count = dates.size();
		System.out.println(count);
		Thread.sleep(1000);
		for (int i = 0; i < count; i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("8")) {
				dates.get(i).click();
				break;
			}

		}
	}

}