package com.saucedemo.utils;

public enum AccessList {
    URL_PLATFORM("https://www.saucedemo.com/"),
    ROUTE_EXCEL("/user_data.xlsx");


    private String route;

    AccessList(String ruta) {
        this.route = ruta;
    }

    public String getRoute() {
        return route;
    }
}
