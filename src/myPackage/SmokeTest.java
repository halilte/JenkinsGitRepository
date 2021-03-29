package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {

	@Test
	public void loginTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\JAVA-WORKS\\Selenium15-03\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[6]/a/span")).click();

		Thread.sleep(5000);
		driver.quit();
	}
}
