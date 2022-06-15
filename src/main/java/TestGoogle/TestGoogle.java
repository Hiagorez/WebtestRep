package TestGoogle;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
	@Test
	public void CriarLogin() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]//a[@class=\"login\"]")).click();
		
		driver.findElement(By.id("email_create")).click();
		driver.findElement(By.id("email_create")).sendKeys("ANDERSONFIKKDSA@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Mãe");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("customer_lastname")).click();
		driver.findElement(By.id("customer_lastname")).sendKeys("doAnderson");
		
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("passwd")).sendKeys("12345");
		
		driver.findElement(By.id("days")).click();
		driver.findElement(By.xpath("//*[@id=\"days\"]/option[11]")).click();
	
		driver.findElement(By.id("months")).click();
		driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]")).click();
	
		driver.findElement(By.id("years")).click();
		driver.findElement(By.xpath("//*[@id=\"years\"]/option[26]")).click();
	
		driver.findElement(By.id("address1")).click();
		driver.findElement(By.id("address1")).sendKeys("Street Company Box");
		driver.findElement(By.id("address2")).click();
		driver.findElement(By.id("address2")).sendKeys("Apart 104");
	
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("Tucson");
		
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("city")).sendKeys("Tucson");
		driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[4]")).click();
		driver.findElement(By.id("postcode")).click();
		driver.findElement(By.id("postcode")).sendKeys("85730");
		driver.findElement(By.id("id_country")).sendKeys("Tucson");
		driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]")).click();
		
		driver.findElement(By.id("other")).click();
		driver.findElement(By.id("other")).sendKeys("Moro com meu namordao felipe");
		driver.findElement(By.id("phone")).click();
		driver.findElement(By.id("phone")).sendKeys("942208455");
		driver.findElement(By.id("phone_mobile")).click();
		driver.findElement(By.id("phone_mobile")).sendKeys("2145218463");
		driver.findElement(By.id("submitAccount")).click();
	}

}
