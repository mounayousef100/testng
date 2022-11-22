package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttest {
public WebDriver driver;

@BeforeTest()

public void login() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://github.com/login");
	
	driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("mounayousef100");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123@mouna");
	driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();
}
@Test(groups = "titel")
public void TestTheTitle() { 
	String ActualTitel = driver.getTitle();
	String ExpectedTitel = "GitHub";
	
	Assert.assertEquals(ActualTitel,ExpectedTitel);
	
}

@Test(groups = "print")
public void TestLogOut() { 
	System.out.println("logged out");
	
}

@Test(groups = "print")
public void Test() { 
	System.out.println("logged out");
	
}
}
