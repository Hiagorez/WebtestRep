package TestGoogle;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsuario {

	@Test
	public void Login () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");	
		driver.findElement(By.xpath("//*[@id=\"header\"]//a[@class=\"login\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("ANDERSONFIKKDSA@gmail.com");
		
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("passwd")).sendKeys("12345");
		
		driver.findElement(By.id("SubmitLogin")).click();
	
		driver.close();
		
	}
		
	
	@Test
	public void AcessarOurStores () {
		
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
		
		driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a")).click();
	
		driver.close();
	}

}
	

