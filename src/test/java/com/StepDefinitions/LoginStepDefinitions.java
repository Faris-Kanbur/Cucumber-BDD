package com.StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {
	
	WebDriver driver;

	@Given("User is on the LoginPage")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^User enters (.+) and (.+)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Then("User should land on HomePage")
	public void user_should_land_on_home_page() {

		System.out.println("User lands on HomePage");
		driver.close();

	}
	
	// DataTable
	@When("User enters credentails using DataTable")
	public void user_enters_credentails_using_data_table(DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<List<String>> data = dataTable.cells();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
	}
}
