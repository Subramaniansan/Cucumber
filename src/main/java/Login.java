import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
static WebDriver driver;
	@Given("user launches a application")
	public void user_launches_a_application() {
			WebDriverManager.chromedriver().setup();
		       driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user click signin")
	public void user_click_signin() {
    WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(signin).perform();
	WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
	signIn.click();
	}

	@Given("user click on create account")
	public void user_click_on_create_account() {
	  WebElement createAcnt = driver.findElement(By.xpath("//a[contains(text(),'Create')] "));
	createAcnt.click();
	}

	@When("User enters the details by two dim list")
	public void user_enters_the_details_by_two_dim_list(DataTable dataTable) {
		
                    List<List<String>> data = dataTable.asLists(String.class);	   
	 driver.findElement(By.id("ap_customer_name")).sendKeys(data.get(1).get(0),Keys.ENTER);
	 driver.findElement(By.id("ap_phone_number")).sendKeys(data.get(1).get(1),Keys.ENTER);
	 driver.findElement(By.id("ap_email")).sendKeys(data.get(1).get(2),Keys.ENTER);
	 driver.findElement(By.id("ap_password")).sendKeys(data.get(1).get(3));
	}

	@When("user clicks submit")
	public void user_clicks_submit() {
	   driver.findElement(By.id("continue")).click();
	}

	@Then("user verify the account is created")
	public void user_verify_the_account_is_created() {
	   driver.quit();
	}
	
	@When("User enters the details by two dim map")
	public void user_enters_the_details_by_two_dim_map(DataTable dataTable) {
	  List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
	  driver.findElement(By.id("ap_customer_name")).sendKeys(datas.get(2).get("Name"),Keys.ENTER);
		 driver.findElement(By.id("ap_phone_number")).sendKeys(datas.get(2).get("Phoneno"),Keys.ENTER);
		 driver.findElement(By.id("ap_email")).sendKeys(datas.get(2).get("Email"),Keys.ENTER);
		 driver.findElement(By.id("ap_password")).sendKeys(datas.get(2).get("Password"));
	}



}
