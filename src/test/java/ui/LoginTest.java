package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to Application");
	}
	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected");
	}
	@AfterMethod
	public void disConnectFromDB() {
		System.out.println(" Disconnect DB connected");
	}
	
	@Test(priority=1,description="This is Login test")
	public void aTest1() {
		System.out.println("test1");
	}
	@Test(priority=2,description="This is Logout test")
	public void aTest2() {
	
	System.out.println("test2");
	}
	
	
}
