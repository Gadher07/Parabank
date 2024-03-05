package browserManager;

import driverFactory.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import util.PropertyLoader;


import java.io.File;

public class ChromeManager extends DriverManager {
    private ChromeDriverService chromeDriverService;

    public void startService() {
        if (null == chromeDriverService) {
            try {
                chromeDriverService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(PropertyLoader.loadProperty("chromeDriver")))
                        .usingPort(4732).build();
                chromeDriverService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void stopService(){
        if(null !=chromeDriverService && chromeDriverService.isRunning())
            chromeDriverService.stop();
    }
    public void createDriver(){
        driver = new ChromeDriver(chromeDriverService);
    }
}
