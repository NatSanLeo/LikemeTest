package utilidades;

public enum ConstansPage {
    MY_USER("nataliasanleo95@gmail.com"),
    PASSWORD("Prueba2024*"),
    RESPOSIVE_DESKTOP("start-maximized"),
    RESPOSIVE_MOBILE("window-size=414,896");

    private String valor;

    ConstansPage(final String v) {
        valor = v;

    }

    @Override
    public String toString() {
        return this.valor;
    }
}

