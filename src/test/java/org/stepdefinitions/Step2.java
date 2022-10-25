package org.stepdefinitions;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class Step2 extends Baseclass {

	@Given("user need to be in homepage")
	public void user_need_to_be_in_homepage() {
	  chromeBrowser();
	  launchUrl("https://www.amazon.com/");
	  maxwindow();
	}

	@When("user should enter product name in search box")
	public void user_should_enter_product_name_in_search_box(io.cucumber.datatable.DataTable dataTable) {
	    WebElement prname = driver.findElement(By.id("twotabsearchtextbox"));
	    fillTextBox(prname, "Iphone");
	    
	}

	@When("user clicks search button")
	public void user_clicks_search_button() {
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
	    clk(searchbtn);
	}

	@Then("user will navigated to products page")
	public void user_will_navigated_to_products_page() {
	}
}
