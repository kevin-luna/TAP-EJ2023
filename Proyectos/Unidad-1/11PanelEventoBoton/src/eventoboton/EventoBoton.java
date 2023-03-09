package paneleventoboton;

import javax.swing.JFrame;

/**
 *
 * @author Joyce Tahily
 */
public class EventoBoton {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      JFrame f = new JFrame("Eventos del botón");
      PanelEventoBoton panel = new PanelEventoBoton();
      f.setSize(800,600);
      f.setLocation(100,100);
      f.add(panel);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
  }
  
}
