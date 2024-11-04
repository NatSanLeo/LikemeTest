package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AcctionsAboutPage {

    static WebDriver driver;

    public AcctionsAboutPage(WebDriver _driver) {
        driver = _driver;
    }

    public void clickToXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();

    }
    public void clickToID(String id) {
        driver.findElement(By.id(id));

    }

    public void escribir(String text, String xpath) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);

    }
    public void escribirIntoID(String text, String id) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void esperar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver _driver) {
        this.driver = _driver;
    }


}
