package Tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteLauncher {
	public static void main(String[] args) {
    	
    	String driverPath = "C:\\Users\\Admin\\eclipse-workspace\\TechPubConnect\\src\\Drivers\\chromedriver.exe";      
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://techpub-connect-demo.netlify.app/html/contactus.html");
		driver.fiendelement(By.xpath("/html/body/main/div/section[2]/div/div/div[3]/div/form/div[1]/input"));
		driver.fiendelement(By.xpath("/html/body/main/div/section[2]/div/div/div[3]/div/form/div[2]/input"));
		driver.fiendelement(By.xpath("/html/body/main/div/section[2]/div/div/div[3]/div/form/div[3]/input"));
		driver.fiendelement(By.xpath("/html/body/main/div/section[2]/div/div/div[3]/div/form/div[4]/input"));
		driver.fiendelement(By.xpath("/html/body/main/div/section[2]/div/div/div[3]/div/form/div[4]/input"));
		driver.fiendelement(By.name("/button=@[class='theme_btn border_btn active mt-20']"));
		driver.fiendelement(By.xpath("/html/body/main/section[2]/div/div/div/div[2]/div/div/form/input"));
		driver.fiendelement(By.xpath("/html/body/main/section[2]/div/div/div/div[2]/div/div/button"));
		 driver.quit();
	}

}
