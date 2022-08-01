package Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import impt.DriverLoc;

public class Framestest {
	
	public WebDriver driver;
	@Test
	public void FramesTesttopic() throws InterruptedException {
		driver=DriverLoc.initializeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		int framesOverall=driver.findElements(By.tagName("frame")).size();
		System.out.println(framesOverall);
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.cssSelector("body")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		Thread.sleep(500);
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.cssSelector("body")).getText());
		driver.switchTo().defaultContent();
		driver.close();
	}

}
