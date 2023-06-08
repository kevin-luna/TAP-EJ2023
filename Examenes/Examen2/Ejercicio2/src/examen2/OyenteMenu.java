/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteMenu implements ActionListener{

  private VentanaMalla ventana;
  private PanelConMalla panel;

  public OyenteMenu(VentanaMalla ventana, PanelConMalla panel) {
    this.ventana = ventana;
    this.panel = panel;
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    JMenuItem opcion = (JMenuItem)e.getSource();
    switch (opcion.getName()) {
      case "abrir":{
        File archivo=null;
        BufferedReader buffer = null;
        int filas = 0;
        int columnas = 0;
        try {
          archivo = abrirArchivo();
          if(archivo!=null){
            buffer = new BufferedReader(new InputStreamReader(new FileInputStream(archivo)));
            filas = Integer.parseInt(buffer.readLine());
            columnas = Integer.parseInt(buffer.readLine());
            buffer.close();
          }
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(ventana, "No se pudo abrir el archivo.","Error",JOptionPane.ERROR_MESSAGE);
          break;
        } catch (NumberFormatException nfe){
          JOptionPane.showMessageDialog(ventana, "El archivo contiene datos no numéricos.","Error",JOptionPane.ERROR_MESSAGE);
          break;
        }
        
        panel.setFilas(filas);
        panel.setColumnas(columnas);
        ventana.repaint();
        break;
      }
      case "salir":{
        System.exit(0);
        break;
      }
    }
  }
  
  private File abrirArchivo(){
    JFileChooser selector = new JFileChooser();
        int retorno = selector.showOpenDialog(ventana);
        if(retorno==JFileChooser.APPROVE_OPTION){
          return selector.getSelectedFile();
        }
        return null;
  }
}
