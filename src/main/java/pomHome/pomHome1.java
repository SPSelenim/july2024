package pomHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomHome1 {

	public String First = "fname";
	public String Last = "lname";
	public WebDriver driver = null;

	public pomHome1(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		WebElement firstName;
		firstName = driver.findElement(By.id(First));
		return firstName;
	}

	public WebElement getLastName() {
		WebElement LastName;
		LastName = driver.findElement(By.id(Last));
		return LastName;
	}

	public void sendFirstName(String FirstName) {
		getFirstName().sendKeys(FirstName);
	}

	public void sendLastName(String LastName) {
		try {
			getLastName().sendKeys(LastName);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clearData() {
		getFirstName().clear();
		getLastName().clear();

	}

}
