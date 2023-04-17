/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventoteclado;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import modelos.Dibujable;
import modelos.Figura;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteTeclado extends KeyAdapter{

  private Figura modelo;
  private PanelDibujable vista;
  
  public OyenteTeclado(Figura modelo,PanelDibujable vista){
    this.modelo = modelo;
    this.vista = vista;
  }
  
  @Override
  public void keyPressed(KeyEvent e){
    //System.out.println("Tecla = "+e.getKeyCode());
    int codigo = e.getKeyCode();
    switch(codigo){
      case KeyEvent.VK_UP:{
        modelo.y=modelo.y--;
        vista.repaint();
      }
    }
  }
}
