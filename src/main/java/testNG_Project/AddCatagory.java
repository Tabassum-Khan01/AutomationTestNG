//Test 1: Validate a user is able to add a category and once the category is added it should display.
package testNG_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class AddCatagory {

	WebDriver driver;
	
	By addCatagory = By.xpath("//*[@id=\"extra\"]/input[1]");
	By addCatgButton = By.xpath("//*[@id=\"extra\"]/input[2]");

	@Test
	public void toggleAll() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/105/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(addCatagory).sendKeys("Taba123");
		driver.findElement(addCatgButton).click();
	}

	// @After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
