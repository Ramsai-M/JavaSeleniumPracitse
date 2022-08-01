package Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import impt.DriverLoc;;

public class CheckBoxes {
	public WebDriver driver;
	
	@Test
	public void CheckBoxesTest() throws InterruptedException {
		driver=DriverLoc.initializeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.getTitle();
		int checkboxsize=driver.findElements(By.tagName("input")).size();
		for(int i=1;i<=checkboxsize;i++) {
		if(driver.findElement(By.xpath("//input[@type='checkbox']["+i+"]")).isSelected()) {
			System.out.println("CheckBox "+i+" is selected "+driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		}else {
			driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
			System.out.println("Just checkedout the Check box"+i+".");
		}
		Thread.sleep(2000);
		}
		driver.close();
		
	}

}
