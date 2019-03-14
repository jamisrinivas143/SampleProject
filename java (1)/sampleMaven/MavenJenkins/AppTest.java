package sampleMaven.MavenJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	
	@Test
	public void testcase(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='gb_70']")).click();

}
}