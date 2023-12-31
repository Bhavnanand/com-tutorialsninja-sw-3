package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public  static WebDriver driver;
    public void openBrowser(String baseUrl){
        //launch the Chromebrowser
        driver =new ChromeDriver();
        driver.get(baseUrl);
        //Maximize browser
        driver.manage().window().maximize();
        //we give implicit wait time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.quit();
    }
}


