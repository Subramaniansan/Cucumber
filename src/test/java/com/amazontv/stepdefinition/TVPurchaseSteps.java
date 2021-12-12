package com.amazontv.stepdefinition;

import java.util.List;
import java.util.Map;
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
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TVPurchaseSteps {
	static WebDriver driver;
	static String tvName;
	@Given("User launches application")
	public void user_launches_Amazon_application() {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	@When("User search tv")
	public void user_search_tv() {
		tvName = "Samsung 108 cm";
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    	searchBox.click();
    	searchBox.sendKeys(tvName,Keys.ENTER);
    	
	}

	@When("User click on tv name")
	public void user_click_on_tv_name() {
WebElement tv = driver.findElement(By.xpath("(//span[contains(text(),'"+tvName+"')])[2]"));
	tv.click();
	}
	
	


@Then("User click on Buy now")
public void user_click_on_Buy_now() {
	String parentWindow = driver.getWindowHandle();
    Set<String> childWindow = driver.getWindowHandles();
    for (String newWindow : childWindow) {
		if(!newWindow.equals(parentWindow)) {
			driver.switchTo().window(newWindow);
}
		}
	WebElement buyNow = driver.findElement(By.id("buy-now-button"));
	buyNow.click();
	driver.quit();
}



@When("User search tv by one dim list")
public void user_search_tv_by_one_dim_list(DataTable dataTable) {
   List<String> asList = dataTable.asList(String.class);
   
   WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.click();
	searchBox.sendKeys(asList.get(1),Keys.ENTER);
	tvName = asList.get(1);
}


@When("User search tv by one dim map")
public void user_search_tv_by_one_dim_map(DataTable dataTable) {
   Map<String, String> asMap = dataTable.asMap(String.class, String.class);
   WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
 	searchBox.click();
 	searchBox.sendKeys(asMap.get("3"),Keys.ENTER);
      tvName =  asMap.get("3");
}                   

@When("User search tv {string}")
public void user_search_tv(String tv) {
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
 	searchBox.click();
 	searchBox.sendKeys(tv,Keys.ENTER);
      tvName =  tv;

}
}

