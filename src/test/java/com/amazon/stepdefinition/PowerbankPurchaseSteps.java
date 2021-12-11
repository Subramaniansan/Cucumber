package com.amazon.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PowerbankPurchaseSteps {
	static WebDriver driver;

	@Given("User launches Amazon application")
	public void user_launches_Amazon_application() {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@When("User search powerbank")
	public void user_search_powerbank() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    	searchBox.click();
    	searchBox.sendKeys("powerbank",Keys.ENTER);
    	
	}

	@When("User click on powerbank name")
	public void user_click_on_powerbank_name() {
		WebElement powerBank = driver.findElement(By.xpath("(//span[contains(text(),'pTron Dynamo Pro 10000mAh')])[1]"));
		    powerBank.click();
		    
		    
		    }

	@Then("User click on buy now")
	public void user_click_on_buy_now() {
		String parentWindow = driver.getWindowHandle();
	    Set<String> childWindow = driver.getWindowHandles();
	    for (String newWindow : childWindow) {
			if(!newWindow.equals(parentWindow)) {
				driver.switchTo().window(newWindow);
}
			}
		WebElement buyNow = driver.findElement(By.id("buy-now-button"));
		buyNow.click();
	}


}
