package com.OrangeHRM.TestCases;

import java.util.Map;

import org.testng.annotations.Test;

import com.OrangeHRM.Base.TestBase;
import com.OrangeHRM.Pages.AdminPage;

public class AdminPageTest extends TestBase {
	
	AdminPage adminPage;
	
	@Test(dataProvider="getData",dataProviderClass = com.OrangeHRM.Utilities.DataProviderUtils.class)
	public void ToCheckAdminPageSearch(Map<String,String> data) throws InterruptedException {
		adminPage= new AdminPage(driver);
		adminPage.linkAdmin.click();
		Thread.sleep(5000);
		adminPage.selectOptionFromDropdown(adminPage.dropdownUserRole, data.get("UserRole"));
		Thread.sleep(10000);
		adminPage.selectOptionFromDropdown(adminPage.dropdownStatus, data.get("Status"));
		Thread.sleep(10000);
	}

	
	
}
