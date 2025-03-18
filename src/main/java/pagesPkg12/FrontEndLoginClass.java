package pagesPkg12;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontEndLoginClass {

	private WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	//Properties prop;



	private	By usernameField= By.name("username");

	private	By passwordField= By.name("password");

	private	By loginButton= By.id("cred_sign_in_button");


	public FrontEndLoginClass(WebDriver driver) {
		this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));  
		
	}


	public void clickLogin() {
	
		wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
		
		driver.findElement(usernameField).sendKeys("kensixww@yopmail.com");
		driver.findElement(passwordField).sendKeys("pass@1234");

		driver.findElement(loginButton).click();

	}
}
