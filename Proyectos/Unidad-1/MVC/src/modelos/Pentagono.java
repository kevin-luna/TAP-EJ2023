/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Pentagono extends Figura{
  private int lados;
  
  public Pentagono(int x,int y,int lados,Color color){
    super(x,y,color);
    this.lados=lados;
  }
  
  public Pentagono(){
    this(0,0,0,Color.BLACK);
  }
  
  @Override
  public double getArea() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public double getPerimetro() {
    return lados;
  }

  @Override
  public void dibujar(Graphics g) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  /**
   * @return the lados
   */
  public int getLados() {
    return lados;
  }

  /**
   * @param lados the lados to set
   */
  public void setLados(int lados) {
    this.lados = lados;
  }
  
}
