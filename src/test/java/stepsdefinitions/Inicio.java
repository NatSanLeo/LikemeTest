package stepsdefinitions;

import drivers.navegador.Browser;
import interactions.AcctionsAboutPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

import static userInterfaces.ElementsPage.*;
import static utilidades.ConstansPage.*;

public class Inicio extends AcctionsAboutPage {
    WebDriver driver;

    public Inicio() {
        super(null);
    }

    @BeforeEach
    public void abrirPagina() {
        Browser BR = new Browser(driver);
        driver = BR.openBrowser(String.valueOf(RESPOSIVE_DESKTOP));
        setDriver(driver);
        clickToXpath(CLOSE_MODAL.getPath());
        clickToXpath(PROFILE_BUTTON.getPath());
        escribirIntoID(MY_USER.toString(), "email");
        escribirIntoID(PASSWORD.toString(), "pass");
        clickToXpath(INCIAR_SESION_BUTTON.getPath());
        esperar();

    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    @Step("Seleccionando la marca de ropa 'Pacifika'")
    @Test
    @Tag("Regresion")
    public void chooseBrand() {
        clickToXpath(SELECT_BRAND.getPath());
        esperar();

    }

    @Step("Seleccionando el genero de ropa 'Mujer'")
    @Test
    @Tag("Regresion")
    public void chooseGender() {
        clickToXpath(SELECT_BRAND.getPath());
        clickToXpath(SELECT_MUJER.getPath());
        esperar();

    }

    @Step("Seleccionando la talla de ropa 'S'")
    @Test
    @Tag("Regresion")
    public void chooseSize() {
        clickToXpath(SELECT_BRAND.getPath());
        clickToXpath(OPEN_SELECT_SIZE.getPath());
        clickToXpath(SELECT_SIZE_S.getPath());
        esperar();

    }

    @Step("Seleccionando un producto y observando los detalles")
    @Test
    @Tag("Regresion")
    public void datailsOfProduct() {
        clickToXpath(SELECT_BRAND.getPath());
        clickToXpath(SELECT_PRODUCT.getPath());
        clickToXpath(SELECT_SIZE_INTO_PRODUCT.getPath());
        clickToXpath(ADD_CARD_BUTTON.getPath());
        clickToXpath(SELECT_CARD.getPath());
        esperar();


    }

}
