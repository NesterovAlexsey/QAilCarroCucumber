package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarRegistrationPage extends BasePage {

  public CarRegistrationPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//a[.=' Let the car work ']")
  WebElement letTheCarWork;
  public CarRegistrationPage clickOnLetTheCarWork() {
    pause(2000);
    click(letTheCarWork);
    return this;
  }
}
