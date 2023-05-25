package Tech;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = "C:\\Users\\Admin\\eclipse-workspace\\TechPubConnect\\src\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techpub-connect-demo.netlify.app/html/contactus.html");
		driver.findElement(By.xpath("//div[contains(@class,'col-lg-6 col-md-6')]//input")).sendKeys("Akshaya");
		driver.findElement(By.xpath("(//div[contains(@class,'col-lg-6 col-md-6')]//input)[2]")).sendKeys("9977665544");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//label[text()='Subject']/following-sibling::input")).sendKeys("subject");
		Actions actions = new Actions(driver);
		WebElement message = driver.findElement(By.xpath("//textarea[@cols='30']"));
		message.sendKeys("Message");
		message.sendKeys(Keys.TAB);
		WebElement submitButton = driver.findElement(By.xpath("//button[contains(@class,'theme_btn border_btn')]"));
		actions.moveToElement(submitButton).doubleClick();
		driver.quit();
	}

}
