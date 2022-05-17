package com.saucedemo.utils;

import java.util.Map;
import java.util.TreeMap;

import static com.saucedemo.utils.AccessList.ROUTE_EXCEL;

public class GetInformation {
    private static Map<Integer, Map<Integer, String>> dataDrive = new TreeMap<>();
    private static String user;
    private static String password;
    private static String article;
    private static String name;
    private static String lastName;
    private static String postalCode;

    public static void getContent(int sheet, int row) {
        dataDrive = loadDataDrive(sheet);
        user = dataDrive.get(row).get(0);
        password = dataDrive.get(row).get(1);
        article = dataDrive.get(row).get(2);
        name = dataDrive.get(row).get(3);
        lastName = dataDrive.get(row).get(4);
        postalCode = dataDrive.get(row).get(5);
    }

    public static Map<Integer, Map<Integer, String>> loadDataDrive(int sheet) {
        DataDriveExcel document = new DataDriveExcel();
        return document.loadDataDrive(ROUTE_EXCEL.getRoute(), sheet);
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    public static String getArticle() {
        return article;
    }

    public static String getName() {
        return name;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getPostalCode() {
        return postalCode;
    }
}
