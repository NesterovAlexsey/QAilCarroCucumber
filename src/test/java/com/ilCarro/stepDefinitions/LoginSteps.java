package com.ilCarro.stepDefinitions;

import static com.ilCarro.pages.BasePage.driver;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {

  @And("User clicks on Log in link")
  public void clicks_on_Log_in_link() {
    new HomePage(driver).clickOnLoginLink();
  }

  @And("User enters valid data")
  public void enters_valid_data() {
    new LoginPage(driver).enterData("nesterov.alex@gmail.com", "1234567890qW!");
  }

  @And("User clicks on Yalla button")
  public void clicks_on_Yalla_button() {
    new LoginPage(driver).clickOnYallaButton();
  }

  @Then("User verifies log in message")
  public void verifies_log_in_message() {
    new LoginPage(driver).isLoginMessageDisplaied();
  }

  @And("User enters valid email and wrong password")
  public void enters_valid_email_and_wrong_password(DataTable dataTable) {
    new LoginPage(driver).enterWrongPassword(dataTable);
  }

  @Then("User verifies error message")
  public void verifies_error_message() {
    new LoginPage(driver).getError();
  }
}
