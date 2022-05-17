package com.saucedemo.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExtraerData {

    private String rutaArchivoExcel;

    public ExtraerData(String rutaArchivoExcel) {
        this.rutaArchivoExcel = rutaArchivoExcel;
    }

    public ArrayList<String> ObtenerData() {
        int i = 0;
        List<String> dataUsuario = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(rutaArchivoExcel);// se crea un objeto donde estan todos los datos del archivo que cargamos
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);// Crear el libro de trabajo
            XSSFSheet firstSheet = workbook.getSheet("Hoja1");//Crear la hoja de trabajo
            Iterator<Row> rowIterator = firstSheet.iterator();//Una vez obtenida la hoja excel con las filas que se quieren leer obtenemos el rowIterator. Permite recorrer cada una de las filas que contiene.

            DataFormatter formatter = new DataFormatter();
            //Recorrer todas las filas para mostrar el contenido de cada celda

            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                // Obtenemos el iterator que permite recorres todas las celdas de una fila
                Iterator cellIterator = nextRow.cellIterator();

                if (i != 0) {
                    while (cellIterator.hasNext()) {
                        Cell cell = (Cell) cellIterator.next();
                        String contenidoCelda = formatter.formatCellValue(cell);
                        dataUsuario.add(contenidoCelda);
                    }
                }
                i++;

            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ArrayList<String>) dataUsuario;
    }


    public void recorrerContenidoCredenciales(ArrayList<String> datosUsuario) {
        ArrayList<String> datos;
        datos = datosUsuario;
        System.out.println("Numero de campos " + datos.size());
        for (int j = 0; j <= datos.size() - 1; j++) {
            System.out.println(datos.get(j));
        }
    }


}
