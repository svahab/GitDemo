package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass2 {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select se=new Select(driver.findElement(By.name("country")));
		se.selectByVisibleText("AUSTRALIA");
		
		
}
}
