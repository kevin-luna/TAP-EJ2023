/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventoraton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteRaton extends MouseAdapter {
  private Circulo modelo;
  private PanelDibujable vista;
  private boolean seleccionado;
  private int deltaX;
  private int deltaY;
  
  public OyenteRaton(Circulo modelo,PanelDibujable vista){
    this.modelo = modelo;
    this.vista = vista;
  }
  
  @Override
  public void mouseMoved(MouseEvent e){
    //System.out.println("("+e.getX()+","+e.getY()+")");
    vista.repaint();
  }
  
  @Override
  public void mousePressed(MouseEvent e){
    if(modelo.contiene(e.getX(),e.getY())){
      //System.out.println("Seleccionó el círculo");
      seleccionado=true;
      deltaX = modelo.x-e.getX();
      deltaY = modelo.y-e.getY();
    }
  }
  
  @Override
  public void mouseDragged(MouseEvent e){
    if(seleccionado){
      //System.out.println("Muevo el circulo");
      modelo.x=e.getX()+deltaX;
      modelo.y=e.getY()+deltaY;
      vista.repaint();
    }
  }
  @Override
  public void mouseReleased(MouseEvent e){
    seleccionado=false;
  }
}
