/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Dibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelDibujable extends JPanel{
  private Dibujable modelo;
  
  public PanelDibujable(Dibujable modelo){
    this.modelo = modelo;
    this.setBackground(Color.CYAN);
  }
  
  public PanelDibujable(){
    this(null);
  }
  
  public void addEventos(KeyAdapter oyente){
    this.addKeyListener(oyente);
    this.setFocusable(true);
  }
  
  public void addEventos(MouseAdapter oyente){
    this.addMouseListener(oyente);
    this.addMouseWheelListener(oyente);
    this.addMouseMotionListener(oyente);
    this.setFocusable(true);
  }
  
  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    modelo.dibujar(g);
    g.drawString(modelo.toString(),10,this.getHeight()-10);
    Point puntero = this.getMousePosition();
    if(puntero!=null){
      g.drawString("("+puntero.x+","+puntero.y+")",this.getWidth()-70,this.getHeight()-10);
    }
  }
  
}
