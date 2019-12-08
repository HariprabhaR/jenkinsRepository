package jenkinssample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {
@Test
public void loginTest() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\home\\eclipse-workspace\\AntInJenkins\\lib\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.findElement(By.cssSelector("a.signin")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
