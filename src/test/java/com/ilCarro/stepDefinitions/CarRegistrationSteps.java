package com.ilCarro.stepDefinitions;

import static com.ilCarro.pages.BasePage.driver;

import com.ilCarro.pages.CarRegistrationPage;
import io.cucumber.java.en.And;

public class CarRegistrationSteps {

  @And("User click on Let the car work header button")
  public void click_on_Let_the_car_work_header_button() {
    new CarRegistrationPage(driver).clickOnLetTheCarWork();
  }
}
