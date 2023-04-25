/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejocirculos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteCirculos extends MouseAdapter{
  private final Circulos circulos;
  private final PanelDibujable panel;
  
  public OyenteCirculos(Circulos circulos,PanelDibujable panel){
    this.circulos = circulos;
    this.panel = panel;
  }
  
  @Override
  public void mouseClicked(MouseEvent e){
    Circulo circulo = new Circulo(e.getX(),e.getY(),20,Color.BLUE);
    circulos.add(circulo);
    panel.repaint();
  }
  
  @Override
  public void mouseMoved(MouseEvent e){
    panel.repaint();
  }
}
