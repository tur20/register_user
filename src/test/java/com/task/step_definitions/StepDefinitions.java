package com.task.step_definitions;

import com.task.AutomationExercise_Page;
import com.task.utilities.ConfigurationReader;
import com.task.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

    AutomationExercise_Page page = new AutomationExercise_Page();
    WebDriver driver = Driver.getDriver();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
       driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals("Automation Exercise",driver.getTitle());
    }
    @When("user clicks on Signup \\/ Login button")
    public void user_clicks_on_signup_login_button() {

        page.signupButton.click();
    }
    @Then("user should see {string} message is displayed")
    public void user_should_see_message_is_displayed(String expected) {
        Assert.assertEquals(expected, page.newUserMessage.getText());
    }
    @When("user enters {string} and {string} and clicks Signup button")
    public void user_enters_name_and_email_address_and_clicks_button(String name, String email) {
        page.nameInput.sendKeys(name);
        page.emailInput.sendKeys(email);
        page.signupButton2.click();
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String expected) {
        Assert.assertEquals(expected, page.enterInfoMessage.getText());
    }
    @When("user fills details: Title, {string}, date of birth: day {string}, month {string}, year {string}")
    public void user_fills_details_title_date_of_birth_day_month_year(String password, String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        page.mrRadioButton.click();
        page.passwordInput.sendKeys(password);
        Select selectDays = new Select(page.days);
        Select selectMonths = new Select(page.months);
        Select selectYears = new Select(page.years);

        selectDays.selectByVisibleText(dayOfBirth);
        selectMonths.selectByVisibleText(monthOfBirth);
        selectYears.selectByVisibleText(yearOfBirth);


    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    @When("user selects checkbox Sign up for our newsletter!")
    public void user_selects_checkbox_sign_up_for_our_newsletter() {

        js.executeScript("arguments[0].scrollIntoView();",page.checkboxNewsletter);

        page.checkboxNewsletter.click();

    }
    @When("user select checkbox Receive special offers from our partners!")
    public void user_select_checkbox_receive_special_offers_from_our_partners() {

        js.executeScript("arguments[0].scrollIntoView();",page.checkboxOffer);
        page.checkboxOffer.click();
    }
    @When("user fills details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_fills_details(String firstName, String lastName, String company, String address, String country,
                                   String state, String city, String zipcode, String mobileNumber) {
        page.firstNameInput.sendKeys(firstName);
        page.lastNameInput.sendKeys(lastName);
        page.companyInput.sendKeys(company);
        page.addressInput.sendKeys(address);

        Select selectCountry = new Select(page.country);
        selectCountry.selectByVisibleText(country);

        page.stateInput.sendKeys(state);
        page.cityInput.sendKeys(city);
        page.zipcodeInput.sendKeys(zipcode);
        page.mobileNumberInput.sendKeys(mobileNumber);
    }
    @When("user clicks Create Account button")
    public void user_clicks_create_account_button() {
        page.createAccButton.click();

    }
    @Then("user should see {string} message after creating account")
    public void user_should_see_message_after_creating_account(String expected) {
        Assert.assertEquals(expected, page.accCreatedMessage.getText());
    }
    @When("user clicks Continue button")
    public void user_clicks_continue_button() {
        page.continueButton.click();
    }

    @Then("user should see message contains: {string}")
    public void user_should_see_message_(String expectedInMessage) {
        driver.switchTo().frame(page.iFrame1);
        driver.switchTo().frame(page.iFrame2);
        page.adCloseButton.click();

        driver.switchTo().defaultContent();

        Assert.assertTrue(page.loggedInMessage.getText().contains(expectedInMessage));


    }
    @When("user clicks Delete Account button")
    public void user_clicks_delete_account_button() {
        page.deleteAccButton.click();
    }
    @Then("user should see {string} message and clicks Continue button")
    public void user_should_see_message_and_clicks_continue_button(String expected) {
        Assert.assertEquals(expected,page.accDeletedMessage.getText());
        page.continueButton.click();
        driver.close();
    }
}
