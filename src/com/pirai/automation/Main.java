package com.pirai.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		 // declarations
		 WebDriver driver = new FirefoxDriver();
		 String first_name_input_value = "user first name";
		 String last_name_input_value = "user last name";
		 String email_input_value = "piraiinfotestautomation@gmail.com";
		 String phone_number_input_value = "0123456789";
		 int delay_milli_seconds = 1000;
	 
		 driver.get("https://piraiinfo.com/");
		 
		 addDelay(500); // adding delay
		 
		 clickWithDelay(driver, By.linkText("Home"), delay_milli_seconds);
		 
		 clickWithDelay(driver, By.linkText("About Us"), delay_milli_seconds);
		 
		 clickWithDelay(driver, By.linkText("Services"), delay_milli_seconds);
		 
		 clickWithDelay(driver, By.linkText("DevOps Service"), delay_milli_seconds);

		 clickWithDelay(driver, By.linkText("Enquire Now"), delay_milli_seconds);
		 
		 inputTextWithDelay(driver, By.cssSelector("input[type='text'][placeholder='First name']"), first_name_input_value, delay_milli_seconds);
//		 
		 inputTextWithDelay(driver, By.cssSelector("input[type='text'][placeholder='Last name']"), last_name_input_value, delay_milli_seconds);
//		 
		 inputTextWithDelay(driver, By.cssSelector("input[type='email'][placeholder='example@gmail.com']"), email_input_value, delay_milli_seconds);
//
		 inputTextWithDelay(driver, By.cssSelector("input[type='tel'][placeholder='+0 123 456 789']"), phone_number_input_value, delay_milli_seconds);
		 
		 try {

			    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;	            
	            jsExecutor.executeScript("document.querySelector('button[type=\"submit\"]').click();");
	            addDelay(5000);
	            
	        } 
		 		catch (Exception e) 
		    {
		 			
	            e.printStackTrace();
	        }
		 
		 		finally 
		 	{
	            driver.quit();
	        }
	    }
	 
	 
	  // Custom method to click an element and add a delay
	    public static void clickWithDelay(WebDriver driver, By locator, long milliseconds) {
	        WebElement element = driver.findElement(locator);
	        element.click();
	        addDelay(milliseconds);
	    }
	    
	 
	    // Custom method to input text into a field and add a delay
	    public static void inputTextWithDelay(WebDriver driver, By locator, String text, long milliseconds) {
	        WebElement element = driver.findElement(locator);
	        element.sendKeys(text);
	        addDelay(milliseconds);
	    }
	    
	    
	   // method for adding a delay
	    public static void addDelay(long milliseconds) {
	        try {
	            Thread.sleep(milliseconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	}

}
