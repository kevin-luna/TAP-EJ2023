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
    
  }
  
  @Override
  public void mouseDragged(MouseEvent e){
    
  }
  
  public void mouseReleased(MouseEvent e){
    
  }
}
