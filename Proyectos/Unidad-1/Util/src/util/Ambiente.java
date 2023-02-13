/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Ambiente {

  public static void checarAmbientes() {
    LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
    for (int i = 0; i < looks.length; i++) {
      System.out.println(looks[i].getClassName());
    }
  }

  /**
   * Asigna un nuevo ambiente al proyecto en ejecución
   *
   * @param ambiente Es el tipo de ambiente: Nimbus, Metal, GTK, Motif y Windows
   */
  public static void setAmbiente(String ambiente) {
    String lookAndFeel = "";
    switch (ambiente) {
      case "Nimbus": {
        lookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        break;
      }
      case "Metal": {
        lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
        break;
      }
      case "GTK": {
        lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
        break;
      }
      case "Motif": {
        lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        break;
      }
      case "Windows": {
        lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        break;
      }
      case "Classic": {
        lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
        break;
      }
    } //Switch
    try {
      UIManager.setLookAndFeel(lookAndFeel);
    } catch (ClassNotFoundException
      | InstantiationException
      | IllegalAccessException
      | UnsupportedLookAndFeelException ex) {
      System.out.println("Error de carga de ambiente!! " + ex);
      System.exit(0);
    }
  }
}
