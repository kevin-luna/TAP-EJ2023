/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menus;

import javax.swing.JFrame;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Menus {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame("Ventana con barra de menús");
    BarraMenu bm = new BarraMenu();
    f.setJMenuBar(bm);
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}
