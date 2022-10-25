package org.stepdefinitions;



import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class Step1 extends Baseclass {
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {
	    chromeBrowser();
	   launchUrl("https://www.facebook.com/");
	   maxwindow();
	    }

	@When("user should enter invalid username and invalid password")
	public void user_should_enter_invalid_username_and_invalid_password() {
WebElement userid = driver.findElement(By.id("email"));
fillTextBox(userid, "java");
WebElement passwd = driver.findElement(By.id("pass"));
fillTextBox(passwd, "12345");
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
WebElement log = driver.findElement(By.name("login"));
clk(log);
	}

	@Then("user will navigated to invalid  credential page")
	public void user_will_navigated_to_invalid_credential_page() {
	}
}
