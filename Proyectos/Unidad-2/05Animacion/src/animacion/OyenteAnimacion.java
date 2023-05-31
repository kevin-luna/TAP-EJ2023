/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animacion;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;
import modelos.Imagenes;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteAnimacion extends MouseAdapter{
  private Imagenes imagenes;
  private PanelAnimacion panel;
  private int tiempo;
  
  public OyenteAnimacion(Imagenes imagenes,PanelAnimacion panel){
    this.imagenes = imagenes;
    this.panel = panel;
    tiempo = 100;
    panel.getEtiqueta().setText(Integer.toString(tiempo));
    HiloAnimacion hilo = new HiloAnimacion();
    hilo.start();
  }
  
  @Override
  public void mouseWheelMoved(MouseWheelEvent e){
    System.out.println(e.getWheelRotation());
    if(e.getWheelRotation()>0){
      tiempo=Math.min(250,tiempo+5);
    }else{
      tiempo=Math.max(0, tiempo-5);
    }
    panel.getEtiqueta().setText(Integer.toString(tiempo));
    new HiloAnimacion().start();
  }
  
  public class HiloAnimacion extends Thread{
    public void run(){
      int i=0;
      while(true){
          i = ++i % imagenes.size();
          imagenes.setActiva(i++);
        try {
          Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
          System.out.println("Error de interrupción "+ex);
          System.exit(-1);
        }
        panel.repaint();
        Toolkit.getDefaultToolkit().sync();
      }
    }
  }
}
