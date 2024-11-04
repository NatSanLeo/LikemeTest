package stepsdefinitions;

import drivers.navegador.BrowserMobile;
import interactions.AcctionsAboutPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static userInterfaces.ElementsPage.*;
import static utilidades.ConstansPage.*;

public class StartVerifyPageMobile extends AcctionsAboutPage {
    WebDriver driver;

    public StartVerifyPageMobile() {
        super(null);
    }

    @BeforeEach
    public void abrirPagina() {
        BrowserMobile BR = new BrowserMobile(driver);
        driver = BR.openBrowser(String.valueOf(RESPOSIVE_MOBILE));
        setDriver(driver);
        clickToXpath(CLOSE_MODAL.getPath());
        esperar();

    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }


    @Test
    @Tag("MobileRegresion")
    public void openMenu() {
        clickToXpath(OPEN_MENU.getPath());
        esperar();
    }

    @Test
    @Tag("MobileRegresion")
    public void searchProduct() {
        clickToXpath(SEARCH_LABEL.getPath());
        escribir("Vestidos", SEARCH_INPUT.getPath());
        clickToXpath(SEARCH_BUTTON.getPath());
        esperar();
    }

    @Test
    @Tag("MobileRegresion")
    public void selectBrandType() {
        clickToXpath(SELECT_BRAND_LUG.getPath());
        clickToXpath(PRODUCT_MAIN_CONTENT_LINK.getPath());
        esperar();
    }


}