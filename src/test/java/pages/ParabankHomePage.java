package pages;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankHomePage extends PageObjects{
    @FindBy(xpath = "//*[@id=\"topPanel\"]/a[2]/img")
    WebElement HomePageLogoText;

    @FindBy(xpath = "//input[@value = 'Log In']")
    WebElement loginButton;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerButton;

    public ParabankHomePage(WebDriver driver) {
        super(driver);
    }

}

