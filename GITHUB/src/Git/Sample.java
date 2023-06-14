package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
			Thread.sleep(2000);
			WebElement login = driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']"));
			String value = login.getText();
			System.out.println(value);
			driver.close();
			

}
