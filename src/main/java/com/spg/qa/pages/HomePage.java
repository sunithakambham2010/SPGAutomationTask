package com.spg.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spg.qa.base.TestBase;

public class HomePage extends TestBase{
		
	@FindBy(id="output")
	WebElement consoleOutput;
	
	@FindBy(id="run-button")
	WebElement runButton;
	
	@FindBy(id="save-button")
	WebElement saveButton;
	
	@FindBy(id="login-modal-label")
	WebElement loginWindowText;

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateConsoleOutputText() throws InterruptedException{
		Thread.sleep(3000);
		runButton.click();
		return consoleOutput.getText();
	}
	
	public String validateLoginWindowText() throws InterruptedException{
		saveButton.click();
		Thread.sleep(3000);
		return loginWindowText.getText();
	}
	
}
