package stepDefinition;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ScenarioContext;
import util.DataKey;

import static actions.Actions.isDisplayed;
import static org.hamcrest.core.Is.is;
import static util.WaitUtils.waitUnitCondition;

public class LoginStepts extends AbstractStep {
    private ChromeDriver driver;
    @When("User navigates to the website homepage")
    public void user_navigates_to_the_website_homepage() {
        System.setProperty("webdriver.chrome.driver", "src\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        if(driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed())
            log.info("parabank logo este");
        if(driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed())
            log.info("Cusomter login este");
    }
    @When("User clicks on 'Login' button")
    public void user_clicks_on_Login_buton() throws InterruptedException{
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("//p[@class='error']")).isDisplayed())
            log.info("Please enter a username and password");
        Thread.sleep(1000);
      //  driver.quit();
    }
    @When("User clicks on 'Register' button")
    public void user_clicks_on_Register_button() throws InterruptedException{
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']")).isDisplayed())
            log.info("Please register yourself");
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("//input[@id='customer.username']")).isDisplayed())
            log.info("Cst can fill in his Username");

        if(driver.findElement(By.xpath("//input[@id='customer.password']")).isDisplayed())
            log.info("Cst can fill in his Password");

       /* if(driver.findElement(By.xpath("//input[@id='repeatedPassword']")).isDisplayed())
            log.info("Cst can fill in his Password confirmation");*/

        Assert.assertEquals("Confirm:", driver.findElement(By.xpath("//b[normalize-space()='Confirm:']")).getText());


    }
    @When("User inserts some of mandatory fields")
    public void user_inserts_some_of_mandatory_fields() throws InterruptedException {
        String username = "Gadher";
        String password = "123456";
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
        ScenarioContext.saveData(DataKey.USERNAME,username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
        ScenarioContext.saveData(DataKey.PASSWORD,password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(1000);
        //driver.quit();
    }
}
