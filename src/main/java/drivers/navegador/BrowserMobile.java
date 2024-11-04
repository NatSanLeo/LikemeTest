package drivers.navegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserMobile {
    WebDriver driver;


    public BrowserMobile(WebDriver _driver) {
        driver = _driver;
    }


    public WebDriver openBrowser(String size) {
        try {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/navegador/chromedriver-win64/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments(size);
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get("https://www.likeme.com.co/");
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        } catch (Exception e) {
            System.out.println(e.getMessage() + "Revisa tu código");
        }
        return driver;

    }
}

