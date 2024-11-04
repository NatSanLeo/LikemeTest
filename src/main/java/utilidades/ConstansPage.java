package utilidades;

public enum ConstansPage {



        CODPOSTAL_USER_TO_PAY("1112"),
        LAST_NAME_TO_PAY("Santos"),
        NAME_USER_TO_PAY("Natalia"),
        PASSWORD("Prueba2024*"),
        RESPOSIVE_DESKTOP("start-maximized"),
        RESPOSIVE_MOBILE("window-size=414,896"),

        MY_USER("nataliasanleo95@gmail.com");

        private String valor;

        ConstansPage(final String v) {
            valor = v;

        }

        @Override
        public String toString() {
            return this.valor;
        }
    }

