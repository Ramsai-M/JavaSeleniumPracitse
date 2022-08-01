package impt;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLoc {
	
		public static WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\this pc\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}

}
