package com.OrangeHRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	public  WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//label[normalize-space()='User Role']/../..")
	public WebElement dropdownUserRole;
	
	@FindBy(xpath= "//div[@role='listbox']//div")
	public  List<WebElement> listOfOptions;
	
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement linkAdmin;
	
	@FindBy(xpath="//label[normalize-space()='Status']//following::div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement dropdownStatus;

	public void selectOptionFromDropdown(WebElement element, String Value) {
		element.click();
		
	
			for(int i=0; i<listOfOptions.size(); i++ ) {
				if(listOfOptions.get(i).getText().equalsIgnoreCase(Value)) {
					listOfOptions.get(i).click();
					break;
				}
			}
		
	}
}
