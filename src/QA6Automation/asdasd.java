package QA6Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class asdasd {

private static WebDriver driver = null;

public static void main(String[] args) {
    
	//login strings
	
	String u = new String ("zuroalogintest");
	String p = new String ("vocal123");
	
	
    WebDriver driver = new FirefoxDriver();

    driver.get("https://my1.qa6.vocal-qa.com/adminv2/");
  
    WebElement elementusername = driver.findElement(By.name("j_username"));
    WebElement elementpassword = driver.findElement(By.name("j_password"));

    
    elementusername.sendKeys(u);
    elementpassword.sendKeys(p);
    
    //element.submit();

    // Check the title of the page
    System.out.println("Page title is: " + driver.getTitle());
    
    // Google's search is rendered dynamically with JavaScript.
    // Wait for the page to load, timeout after 10 seconds
    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
        public Boolean apply(WebDriver d) {
            return d.getTitle().toLowerCase().startsWith("cheese!");
        }
    });

    // Should see: "cheese! - Google Search"
    System.out.println("Page title is: " + driver.getTitle());
    
    //Close the browser
    //driver.quit();
}
}