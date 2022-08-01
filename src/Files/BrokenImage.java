package Files;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import impt.DriverLoc;

public class BrokenImage {

	public WebDriver driver;
	@Test
	public void BrokenImagetest() throws IOException {
		// TODO Auto-generated method stub
		driver=DriverLoc.initializeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		//SoftAssert a=new SoftAssert();
		driver.getTitle();
		int count=0,cnt=0;
		List<WebElement> imgs=driver.findElements(By.tagName("img"));
		for(WebElement img1:imgs) {
			String url=img1.getAttribute("src");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response=conn.getResponseCode();
			if(response>400) {
				count++;
			}else {
				cnt++;
			}
			//a.assertTrue(response<400,"This image is broken"+img1.getText()+". it is showing the response code"+response);
		}
		//a.assertAll();
		System.out.println("Total images are found in the site is "+imgs.size()+". "+count+" img links are working fine. "+cnt+" img links are not working.");
		driver.quit();

	}

	

}
