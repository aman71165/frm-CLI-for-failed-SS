package pagesPkg12;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleRewardClass {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions action;

	
	private By newRecognitionButton = By.xpath("//span[contains(text(), 'New Recognition')]");  

	private By rewardsTile = By.xpath("//p[contains(text(),'Reward is a monetary type of recognition. Give Rew')]");

	private By rewardnameField = By.xpath("//input[@id='RewardName']");

	private By descriptionField = By.xpath("//textarea[@id='Description']");

	private By individualDropdown= By.xpath("//select[@id='TeamIndividual']");


	private By startDatePicker = By.xpath("//span[@aria-controls='StartDate_dateview']");

	private By endDatePicker = By.xpath("//span[@aria-controls='RewardEndDate_dateview']");

	private By budgetHeadDropdown = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");


	private By rewardPointsField = By.xpath("//input[@id='RewardPoints']");

	private By firstNextbutton = By.xpath("//span[contains(text(), 'Next')]");

	private By locationDropdown = By.xpath("//div[@aria-controls='Location_listbox']");

	private By departmentDropdown = By.xpath("//div[@aria-controls='Department_listbox']");

	private By secondNextbutton = By.xpath("//span[contains(@class, 'btn btn-primary next-stepN')]");

	private By thirdNextbutton = By.xpath("//span[@class= 'btn btn-primary next-stepN']");

	private By workflowDropdown = By.xpath("//select[@id='AssociateWorkFlow']");

	private By policyDropdown = By.xpath("//select[@id='AssociatePolicy']");

	private By reviewButton = By.xpath("//button[contains(text(), 'Review')]");

	private By finishButton = By.xpath("//button[contains(text(), 'Finish')]");
	
	private By logOutlink = By.xpath("//a[@title='Logout']");
	
	private By adminPanelYesButton = By.xpath("//button[contains(text(), 'Yes')]");
	
	private By cancelButton = By.xpath("//button[@type='button' and contains(text(), 'Cancel')]");
	private By cancelOKButton = By.xpath("//button[contains(text(), 'OK')]");
	



	public MultipleRewardClass(WebDriver driver) {
		this.driver= driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));  
		this.action= new Actions(driver);
	}

	
	public void clickNewRecognitionButton(){
	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-bar-spinner")));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(newRecognitionButton));
		driver.findElement(newRecognitionButton).click();
	}


	public void clickRewardsTile(){
		wait.until(ExpectedConditions.presenceOfElementLocated(rewardsTile));
		driver.findElement(rewardsTile).click();
	}


	public void clickRewardnameField_parameterized(String rewardName){
			wait.until(ExpectedConditions.presenceOfElementLocated(rewardnameField));
		driver.findElement(rewardnameField).sendKeys(rewardName);
	}

	public void clickDescriptionField(){
		driver.findElement(descriptionField).sendKeys("Desc automationReward");
	}

	public void clickIndividualDropdown(){
		WebElement eleIndividualOption= driver.findElement(individualDropdown);

		Select individual = new Select(eleIndividualOption);
		individual.selectByVisibleText("Individual");


		js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}



	public void clickStartDatePicker(){
		driver.findElement(startDatePicker).click();

		WebElement eleStartDate= driver.findElement(By.xpath("//a[@title='Friday, April 04, 2025']"));

		js.executeScript("arguments[0].click();", eleStartDate);
	}


	public void clickEndDatePicker(){
		driver.findElement(endDatePicker).click();

		WebElement eleEndDate= driver.findElement(By.xpath("//a[@title='Saturday, April 05, 2025']"));

		js.executeScript("arguments[0].click();", eleEndDate);
	}


	public void clickBudgetHeadDropdown(){
		driver.findElement(budgetHeadDropdown).click();

		WebElement eleOption= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Email-Id: marww@yopmail.com')]")));
		js.executeScript("arguments[0].click();", eleOption);
		
	}

	public void clickRewardPointsField_paramerized(String rewardPoints){
		driver.findElement(rewardPointsField).sendKeys(rewardPoints);
	}

	public void clickFirstNextbutton(){
		driver.findElement(firstNextbutton).click();
	}

	public void clickLocationDropdown(){
		driver.findElement(locationDropdown).click();

		WebElement eleLocationOption= driver.findElement(By.xpath("//li[contains(text(), 'AMRITSAR')]"));
		js.executeScript("arguments[0].click();", eleLocationOption);		
	}

	public void clickDepartmentDropdown(){
		driver.findElement(departmentDropdown).click();

		WebElement eleDepartmentOption= driver.findElement(By.xpath("//li[contains(text(), 'CUSTOMER SUPPORT')]"));
		js.executeScript("arguments[0].click();", eleDepartmentOption);
	}

	public void clickSecondNextbutton(){
		driver.findElement(secondNextbutton).click();
	}

	public void clickThirdNextbutton(){
		driver.findElement(thirdNextbutton).click();
	}


	public void clickWorkflowDropdown(){
		driver.findElement(workflowDropdown).click();

		WebElement eleWorkflow= driver.findElement(workflowDropdown);

		Select workflowOption= new Select(eleWorkflow);
		workflowOption.selectByVisibleText("Direct budget head with nomination");
	}

	public void clickPolicyDropdown(){
		driver.findElement(policyDropdown).click();

		WebElement elePolicy= driver.findElement(policyDropdown);

		Select policyOption= new Select(elePolicy);
		policyOption.selectByVisibleText("Policy 2021 new");
	}

	public void clickReviewButton(){
		driver.findElement(reviewButton).click();
	}

	public void clickFinishButton(){
		System.out.println("this is final page");
	}

	public void clickCancelButton(){
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-bar-spinner")));
		
		driver.findElement(cancelButton).click();
	}

	public void clickCancelOKButton(){
		System.out.println("this is final page");
		driver.findElement(cancelOKButton).click();
	}

	
	public void clickLogoutLink(){
	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-bar-spinner")));
	
			driver.findElement(logOutlink).click();
	}

	
	public void clickAdminPanelYesButton(){
		driver.findElement(adminPanelYesButton).click();
}

	
	public void clickPopupAlert(){
	   Alert alert = driver.switchTo().alert();
	   alert.accept();
}

	public void moveToFrontEnd() throws InterruptedException {

		wait.until(ExpectedConditions.numberOfWindowsToBe(1));

		ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(windowHandles.get(0));
	}
}
