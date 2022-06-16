package TestGoogle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount {

public void AcessarMyPersonal () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");	
		driver.findElement(By.xpath("//*[@id=\"header\"]//a[@class=\"login\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("ANDERSONFIKKDSA@gmail.com");
		
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("passwd")).sendKeys("12345");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.xpath("//*[@id=\"footer\"]//section[5]//li[4]/a")).click();

		driver.findElement(By.id("old_passwd")).click();
		driver.findElement(By.id("old_passwd")).sendKeys("12345");
	
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("passwd")).sendKeys("54321");
		
		driver.findElement(By.id("confirmation")).click();
		driver.findElement(By.id("confirmation")).sendKeys("54321");

		driver.findElement(By.xpath("//*[@id=\"center_column\"]//div[11]/button"));
	}
}

