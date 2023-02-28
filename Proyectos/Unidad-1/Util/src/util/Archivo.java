/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Archivo {

  public static ArrayList<String> leerArchivo(String nombre) {
    ArrayList<String> lineas = new ArrayList();
    try {
      FileReader flujo = new FileReader(nombre);
      BufferedReader buffer = new BufferedReader(flujo);
      String linea = buffer.readLine();
      while(linea!=null){
        lineas.add(linea);
        linea=buffer.readLine();
      }
      buffer.close();
      flujo.close();
    } catch (IOException ex) {
      System.out.println("Error de archivo" + ex);
      System.exit(-1);
    }
    return lineas;
  }

  public static void grabarArchivo(String nombre, ArrayList<String> lineas) {
    try {
      FileWriter flujo = new FileWriter(nombre);
      BufferedWriter buffer = new BufferedWriter(flujo);
      for(String linea: lineas){
        buffer.write(linea);
        buffer.newLine();
      }
      buffer.close();
      flujo.close();
    } catch (IOException ex) {
      System.out.println("Error de archivo "+ex);
      System.exit(-1);
    }
  }
}
