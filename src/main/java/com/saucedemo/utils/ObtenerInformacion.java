package com.saucedemo.utils;

import java.util.Map;
import java.util.TreeMap;

public class ObtenerInformacion {
    private static Map<Integer, Map<Integer, String>> dataDrive = new TreeMap<>();
    private static String usuario;
    private static String password;
    private static String articulo;
    private static String nombre;
    private static String apellido;
    private static String codigoPostal;

    public static void getObtener(int hoja, int fila) {
        dataDrive = loadDataDrive(hoja);
        usuario = dataDrive.get(fila).get(0);
        password = dataDrive.get(fila).get(1);
        articulo = dataDrive.get(fila).get(2);
        nombre = dataDrive.get(fila).get(3);
        apellido = dataDrive.get(fila).get(4);
        codigoPostal = dataDrive.get(fila).get(5);
    }

    public static Map<Integer, Map<Integer, String>> loadDataDrive(int hoja) {
        DataDriveExcel document = new DataDriveExcel();
        return document.loadDataDrive("/data_usuario.xlsx", hoja);
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getPassword() {
        return password;
    }

    public static String getArticulo() {
        return articulo;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static String getCodigoPostal() {
        return codigoPostal;
    }
}
