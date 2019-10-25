package testcasees;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.MainBase;
import pages.LoginPage;

public class LoginTest extends MainBase {
	LoginPage login ;
	
	public LoginTest() {
		
		login= new LoginPage();
	}
	
	@BeforeMethod
	public void setUP() {
		System.out.println("setup");
		logs.info("setup");
		intlize();
		//drive.get("https://www.naukri.com/nlogin/logout");
		
		
	}
	
	
	@Test(priority=1)
	public void getTitle() {
		System.out.println("at get title");
		logs.info("at get title");
		login.getTitle();
		
	}
	

	@Test(priority=2)
	public void LoginintoNaukari() {
		logs.info("calling ligin");
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	
}
