/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligono;

import java.awt.Color;
import java.awt.Graphics;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JPanel;
import util.Archivo;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelPoligono extends JPanel {

  private int[] x;
  private int[] y;

  public PanelPoligono() {
    this.setBackground(Color.CYAN);
    abrirArchivo();
  }

  public void abrirArchivo() {
    String archivo = "/datos/Otro.txt";
    InputStream flujo = getClass().getResourceAsStream(archivo);
    ArrayList<String> lineas = Archivo.leerArchivo(flujo);
    x = new int[lineas.size()];
    y = new int[lineas.size()];
    for (int i = 0; i < lineas.size(); i++) {
      System.out.println(lineas.get(i));
    }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (x != null) {
      g.setColor(Color.BLACK);
      g.fillPolygon(x, y, x.length);
    }
  }
}
