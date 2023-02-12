/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentes;

import javax.swing.JFrame;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Componentes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame("Componentes graficos");
    PanelComponentes panel = new PanelComponentes();
    f.setLocation(100, 100);
    f.setSize(800, 600);
    f.setContentPane(panel);
    f.setDefaultCloseOperation(3);
    f.setVisible(true);
  }

}
