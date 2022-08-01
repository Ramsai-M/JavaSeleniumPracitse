package Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import impt.DriverLoc;

@Test
public class Basic_Auth {
	public WebDriver driver;
	public void Auth() throws InterruptedException {
		driver=DriverLoc.initializeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(1500);
		driver.close();
	}
}
