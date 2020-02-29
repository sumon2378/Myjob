package com.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;

import Pageobject.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	PageObject po;
@Given("^User able to go home page$")
public void user_able_to_go_home_page() throws Throwable {
   getDriver();
   po=PageFactory.initElements(driver, PageObject.class);
}

@When("^user able  to enter email address$")
public void user_able_to_enter_email_address() throws Throwable {
   po.getEmail().sendKeys("sumonbd64ss@gmail.com");
   
}

@When("^user able to create  password$")
public void user_able_to_create_password() throws Throwable {
   po.getPassword().sendKeys("sheik1765");
   
}

@When("^User able to click sign in$")
public void user_able_to_click_sign_in() throws Throwable {
   
   po.getLogin().submit();
}

@Then("^User able to sign up successfully$")
public void user_able_to_sign_up_successfully() throws Throwable {
   
   
}


}
