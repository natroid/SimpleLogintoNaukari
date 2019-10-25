package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import base.MainBase;


public class LoginPage extends MainBase {
	
	public void getTitle() {
		System.out.println("going to the title");
		// [Naukri India | Logout] but found
        //[Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com]
		//Naukri India | Logout] 
		//Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com]
		                                        	
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                                                                	
		logs.info("finding title at login page ");
		String title= "Naukri India | Logout";
		String pageTitle= drive.getTitle();
		Assert.assertEquals(title, pageTitle);
				
	}
	
	
	public void login(String username, String password) {
		
		System.out.println("login test"+username +" pssd "+password);
		drive.findElement(By.id("usernameField")).sendKeys(username);
		drive.findElement(By.id("passwordField")).sendKeys(password);
		drive.findElement(By.xpath("//button[text()='Login']")).click();
		
			}
}
