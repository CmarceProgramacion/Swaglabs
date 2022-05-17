package com.saucedemo.utils;

public enum ListaAccesos {
    URL_PLATAFORMA("https://www.saucedemo.com/"),
    URL_EXCEL("src/test/resources/data_usuario.xlsx");

    private String ruta;

    ListaAccesos(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
}
