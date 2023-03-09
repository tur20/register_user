package com.task;

import com.task.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercise_Page {

    public AutomationExercise_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserMessage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton2;
    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterInfoMessage;
    @FindBy(id = "id_gender1")
    public WebElement mrRadioButton;

    @FindBy(id = "id_gender2")
    public WebElement mrsRadioButton;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement checkboxNewsletter;

    @FindBy(id = "optin")
    public WebElement checkboxOffer;

    @FindBy(id = "first_name")
    public WebElement firstNameInput;

    @FindBy(id = "last_name")
    public WebElement lastNameInput;

    @FindBy(id = "company")
    public WebElement companyInput;

    @FindBy(id = "address1")
    public WebElement addressInput;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement stateInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "zipcode")
    public WebElement zipcodeInput;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumberInput;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccButton;

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accCreatedMessage;

    @FindBy(linkText = "Continue")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@id=\"dismiss-button\"]")
    public WebElement adCloseButton;

    @FindBy(xpath = "//a[.=' Delete Account']")
    public WebElement deleteAccButton;

    @FindBy(xpath = "(//iframe[starts-with(@id,'aswift_')])[4]")
    public WebElement iFrame1;

    @FindBy(xpath = "//iframe[@id=\"ad_iframe\"]")
    public WebElement iFrame2;

    @FindBy(xpath = "//i[@class='fa fa-user']/..")
    public WebElement loggedInMessage;

    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement accDeletedMessage;







}
