package hooks;


        import io.cucumber.java.After;
        import io.cucumber.java.Before;
        import org.openqa.selenium.chrome.ChromeDriver;
        import stepDefinition.AbstractStep;


public class Hooks extends AbstractStep {

    @Before("@UI")
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
    }

    @After("@UI")
    public void closeChromeDriver() {
        log.info("calling method to close the browser");
        driver.close();
        driver.quit();
            }
}

