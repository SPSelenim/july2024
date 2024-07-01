package testHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome.pomHome1;

//12:10 pm

public class testHome {

	public WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		System.out.println("myTestNG : ");
		try {
			pomHome1 ph = new pomHome1(driver);
			ph.sendFirstName("Sateeesh");
			ph.sendLastName("xyzTest");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void f1() {
		System.out.println("myTestNG1 : ");
		try {
			pomHome1 ph = new pomHome1(driver);
			ph.clearData();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}
