package pomDev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomDev1 {

	public String Dev = "//a[@name='Development']";
	public String QA = "//a[@name='QA']";
	public WebDriver driver = null;

	public pomDev1(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDev() {
		WebElement dev;
		dev = driver.findElement(By.xpath(Dev));
		return dev;
	}

	public WebElement getQA() {
		WebElement QA1;
		QA1 = driver.findElement(By.xpath(QA));
		return QA1;
	}

	public void clickDev() {
		try {
		getDev().click();
Thread.sleep(1000);
		driver.navigate().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickQA() {
		try {
		getQA().click();
		Thread.sleep(1000);
		driver.navigate().back();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
