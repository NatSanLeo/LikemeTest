
package userInterfaces;

public enum ElementsPage {
    CLOSE_MODAL("//*[@id='html-body']/div[4]/aside[1]/div[2]/header/button"),
    INCIAR_SESION_BUTTON("//*[@id='send2']"),
    SELECT_BRAND("//*[@id='html-body']/div[2]/header/div[2]/div[1]/div/div/div[1]/div/div/div[5]/div/div/div/div[1]/div/div/div[3]/a"),
    SELECT_MUJER("//*[@id='narrow-by-list']/div[2]/div[2]/div/ol/li[1]/a/label"),
    SELECT_SIZE_S("//*[@id='narrow-by-list']/div[5]/div[2]/div/div/a[3]/div"),
    OPEN_SELECT_SIZE("//*[@id='narrow-by-list']/div[5]/div[1]"),
    ADD_CARD_BUTTON("//*[@id='product-addtocart-button']"),
    SELECT_PRODUCT("//*[@id='product-item-info_645325']//a"),
    SELECT_SIZE_INTO_PRODUCT("//*[@id='option-label-talla-580-item-433']"),
    SELECT_CARD("//*[@id='html-body']/div[2]/header/div[2]/div[2]/div/div[1]/div[3]/div[4]/a"),
    PROFILE_BUTTON("//*[@id='header-my-account']");

    private final String path;

    ElementsPage(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}