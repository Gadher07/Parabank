package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
//import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import util.DataKey;
import util.WaitUntil;

import static actions.Actions.click;
import static actions.Actions.isDisplayed;
import static actions.Actions.sendKey;
import static org.junit.Assert.assertEquals;
import static util.ScenarioContext.getData;
import static util.ScenarioContext.saveData;
import static util.WaitUntil.waitUntilTime;


public class LoginStepsForSingleton extends AbstractStep {
    @Given("User navigates to the website1 homepage")
    public void user_navigates_to_the_website1_homepage() throws InterruptedException {

        click(parabankHomePage.getLoginButton());

        Thread.sleep(1000);
    }

    @When("User click on register button")
    public void user_click_on_register_button() throws InterruptedException {
        click(parabankHomePage.getRegisterButton());
    }

    @And("User inserts some of mandatory fields1")
    public void user_inserts_some_of_mandatory_fields1() throws InterruptedException {

        sendKey(parabankRegisterPage.getFirstName(), "Ion");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getLastName(), "Pirojok");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getAddress(), "str.Albisoara 60/4, ap.32");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getCity(), "Chisinau");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getState(), "MD");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getZipCode(), "MD-2011");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getPhoneNumber(), "060777771");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getSocialNumber(), "A895821325");
        waitUntilTime(1000);
        //sendKey(parabankRegisterPage.getUsername(), "Gadher");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getPassword(), "123456");
        waitUntilTime(1000);
        sendKey(parabankRegisterPage.getRepeatPassword(), "123456");
        waitUntilTime(1000);
        click(parabankRegisterPage.getRegister());
        waitUntilTime(1000);
        //assertEquals("This username already exists", parabankRegisterPage.getRegisterResult().getText());

    }

    @And("User give {}")
    public void user_give_userName(String userName) {
        saveData(DataKey.USERNAME, userName);
        //assertEquals(parabankRegisterPage.getUsername().getText(), "Jora");
        sendKey(parabankRegisterPage.getUsername(), getData(DataKey.USERNAME).toString());
        waitUntilTime(4000);
    }

}
