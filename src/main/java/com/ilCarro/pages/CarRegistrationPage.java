package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarRegistrationPage extends BasePage {

  public CarRegistrationPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//h1[.=' Let the car work ' ]")
  WebElement title;

  //  @FindBy(xpath = "//a[.=' Let the car work ']")
  @FindBy(id = "1")
  WebElement letTheCarWork;
  public CarRegistrationPage clickOnLetTheCarWork() {
    click(letTheCarWork);
    assert isElementDisplayed(title);
    return this;
  }
}
