package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankRegisterPage extends PageObjects {

    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement zipCode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement socialNumber;

    @FindBy(xpath = "//h1[normalize-space()='Signing up is easy!']")
    WebElement RegisterPage;

    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement repeatPassword;

    @FindBy(xpath ="//input[@value='Register']")
    WebElement register;

    @FindBy(xpath ="//*[@id=\"customer.username.errors\"]")
    WebElement registerResult;



    public ParabankRegisterPage(WebDriver driver) {
        super(driver);
    }
}
