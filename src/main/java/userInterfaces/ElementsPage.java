
package userInterfaces;

public enum ElementsPage {
    ADD_CARD_BUTTON("//*[@id='product-addtocart-button']"),
    CLOSE_MODAL("//*[@id='html-body']/div[4]/aside[1]/div[2]/header/button"),
    INCIAR_SESION_BUTTON("//*[@id='send2']"),
    OPEN_MENU("//*[@id='html-body']/div[2]/header/div[2]/div[2]/div/div[1]/div[1]/span"),
    OPEN_SELECT_SIZE("//*[@id='narrow-by-list']/div[5]/div[1]"),
    PRODUCT_MAIN_CONTENT_LINK("//*[@id='maincontent']/div[1]/div/div/div/ul/li[1]/a"),
    PROFILE_BUTTON("//*[@id='header-my-account']"),
    SEARCH_BUTTON("//*[@id='search_mini_form']/div[2]/button"),
    SEARCH_INPUT("//*[@id='search']"),
    SEARCH_LABEL("//*[@id='search_mini_form']/div[1]/label"),
    SELECT_BRAND_LUG("//*[@id='html-body']/div[2]/header/div[2]/div[1]/div/div/div[1]/div/div/div[5]/div/div/div/div[1]/div/div/div[4]"),
    SELECT_BRAND_PCK("//*[@id='html-body']/div[2]/header/div[2]/div[1]/div/div/div[1]/div/div/div[5]/div/div/div/div[1]/div/div/div[3]/a"),
    SELECT_CARD("//*[@id='html-body']/div[2]/header/div[2]/div[2]/div/div[1]/div[3]/div[4]/a"),
    SELECT_MUJER("//*[@id='narrow-by-list']/div[2]/div[2]/div/ol/li[1]/a/label"),
    SELECT_PRODUCT("//*[@id='product-item-info_645325']//a"),
    SELECT_SIZE_INTO_PRODUCT("//*[@id='option-label-talla-580-item-433']"),
    SELECT_SIZE_S("//*[@id='narrow-by-list']/div[5]/div[2]/div/div/a[3]/div");

    private final String path;

    ElementsPage(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}