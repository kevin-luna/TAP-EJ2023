/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Circulo extends Figura{
  private int radio;
  
  public Circulo(int x, int y, int radio, Color color) {
    super(x,y,color);
    this.radio = radio;
  }
  
  public Circulo(){
    this(0,0,0,Color.BLACK);
  }
  
  public boolean contiene(int pX,int pY){
    return(distance(pX,pY)<=radio);
  }
  
  public boolean contiene(Point p){
    return contiene((int)p.x,(int)p.y);
  }
   
   @Override
   public void dibujar(Graphics g){
     Graphics2D g2 = (Graphics2D)g;
     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     g2.setColor(color);
     g2.fillOval(x-radio,y-radio,2*radio,2*radio);
     g2.setColor(Color.BLACK);
     g2.drawOval(x-radio,y-radio,2*radio,2*radio);
   }
   
   @Override
   public double getPerimetro(){
     return Math.PI*2*radio;
   }
   
   @Override
   public double getArea(){
     return Math.PI*radio*radio;
   }
   
   public int getRadio(){
     return radio;
   }
   
   public void setRadio(int radio){
     this.radio = radio;
   }
   
   public Color getColor(){
     return color;
   }
   
   public void setColor(Color color){
     this.color = color;
   }

}
