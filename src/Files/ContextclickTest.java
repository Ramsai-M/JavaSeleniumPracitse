package Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import impt.DriverLoc;

public class ContextclickTest {
	public WebDriver driver;
	@Test
	public void RightClickCheck() throws InterruptedException {
		driver=DriverLoc.initializeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.getTitle();
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("div#hot-spot"));
		a.moveToElement(move).click().contextClick().build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		driver.close();
	}

}
