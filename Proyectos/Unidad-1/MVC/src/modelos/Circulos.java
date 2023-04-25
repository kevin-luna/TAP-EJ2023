/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Circulos extends ArrayList<Circulo> implements Dibujable{
  @Override
  public void dibujar(Graphics g){
    for(Circulo c:this){
      c.dibujar(g);
    }
  }
  
  @Override
  public String toString(){
    return ""+this.size();
  }
}
