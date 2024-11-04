import drivers.navegador.Browser;
import interactions.AcctionsAboutPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static utilidades.DataToNavegateInPage.*;

public class Inicio extends AcctionsAboutPage {
    WebDriver driver;

    public Inicio() {
        super(null);
    }


    @BeforeEach
    public void abrirPagina() {
        Browser BR = new Browser(driver);
        driver = BR.openBrowser("start-maximized");
        setDriver(driver);
        escribir(USER_ADMIN.toString(), "//*[@id='user-name']");
        escribir(PASSWORD.toString(), "//*[@id='password']");
        clickToXpath("//*[@id='login-button']");
        esperar();

    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    @Test
    @Tag("Prueba")
    public void seleccionarProducto() {
        clickToXpath("//*[@id='item_2_title_link']");
        esperar();

    }

    @Test
    @Tag("Prueba")
    public void agregarCarrito() {
        clickToXpath("//*[@id='add-to-cart-sauce-labs-onesie']");
        esperar();

    }

    @Test
    @Tag("Regresion")
    public void payTwoItems() {
        clickToXpath("//*[@id='add-to-cart-sauce-labs-onesie']");
        clickToXpath("//*[@id='shopping_cart_container']/a");
        clickToXpath("//*[@id='continue-shopping']");
        clickToXpath("//*[@id='add-to-cart-sauce-labs-bike-light']");
        clickToXpath("//*[@id='shopping_cart_container']/a");
        clickToXpath("//*[@id='checkout']");
        escribir(NAME_USER_TO_PAY.toString(), "//*[@id='first-name']");
        escribir(LAST_NAME_TO_PAY.toString(), "//*[@id='last-name']");
        escribir(CODPOSTAL_USER_TO_PAY.toString(), "//*[@id='postal-code']");
        clickToXpath("//*[@id='continue']");
        esperar();
        clickToXpath("//*[@id='finish']");
        clickToXpath("//*[@id='back-to-products']");


    }
    @Test
    @Tag("Regresion")
    public void payAnyItems() {
        clickToXpath("//*[@id='shopping_cart_container']/a");
        clickToXpath("//*[@id='checkout']");
        escribir(NAME_USER_TO_PAY.toString(), "//*[@id='first-name']");
        escribir(LAST_NAME_TO_PAY.toString(), "//*[@id='last-name']");
        escribir(CODPOSTAL_USER_TO_PAY.toString(), "//*[@id='postal-code']");
        clickToXpath("//*[@id='continue']");
        esperar();
        clickToXpath("//*[@id='finish']");
        clickToXpath("//*[@id='back-to-products']");


    }
    @Test
    @Tag("Prueba")
    public void filterLowToHigh(){
        clickToXpath("//*[@id='header_container']/div[2]/div/span/select");
        clickToXpath("//*[@id='header_container']/div[2]/div/span/select/option[3]");
        esperar();
    }

    @Test
    @Tag("Prueba")
    public void filterHighToLow(){
        clickToXpath("//*[@id='header_container']/div[2]/div/span/select");
        clickToXpath("//*[@id='header_container']/div[2]/div/span/select/option[4]");
        esperar();
    }
    @Test
    @Tag("Prueba")
    public void filterAToZ(){
        clickToXpath("//*[@id='header_container']/div[2]/div/span/select");
        clickToXpath("//*[@id='header_container']/div[2]/div/span/select/option[1]");
        esperar();
    }


}
