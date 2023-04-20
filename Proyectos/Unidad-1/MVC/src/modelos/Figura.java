/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public abstract class Figura extends Point implements Dibujable{
  
  protected Color color;
  
  public Figura(int x, int y, Color color){
    super(x,y);
    this.color = color;
  }
  
  public Figura(){
    this(0,0,Color.BLACK);
  }

  
 public abstract double getArea();
 
 public abstract double getPerimetro();
 

  /**
   * @return the color
   */
  public Color getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(Color color) {
    this.color = color;
  }
  
  @Override
  public String toString(){
    return " "+x+","+y+" ";
  }
}
