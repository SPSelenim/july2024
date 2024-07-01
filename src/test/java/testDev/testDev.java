package testDev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomDev.pomDev1;

//12:10 pm : 13:20
//15:00 pm :  15: 40

public class testDev {

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
		System.out.println("myTestNG : Dev");
		try {

			pomDev1 dev=new pomDev1(driver);
			dev.clickDev();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void f1devQA() {
		System.out.println("myTestNG1 : QA ");
		try {
			pomDev1 dev=new pomDev1(driver);
			dev.clickQA();
//org.testng.Assert.assertEquals(false, true);
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	@Test
	public void f1() {
		System.out.println("myTestNG1 : DevQA ");
		try {
			pomDev1 dev=new pomDev1(driver);
			dev.clickdevQA();
//org.testng.Assert.assertEquals(false, true);
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	@AfterClass
	public void afterClass() {
		driver.close();

	}

}
