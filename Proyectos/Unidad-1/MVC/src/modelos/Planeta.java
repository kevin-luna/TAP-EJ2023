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
public class Planeta extends Circulo{
  
  private int anchoOrbita;
  private int altoOrbita;
  
  
  public Planeta(int anchoOrbita, int altoOrbita, int radio, Color color){
    super(0,0,radio,color);
    this.anchoOrbita = anchoOrbita;
    this.altoOrbita = altoOrbita;
  }
  
  public void dibujar(Graphics g){
    g.setColor(Color.CYAN);
    g.drawOval(-anchoOrbita/2, -altoOrbita/2, anchoOrbita, altoOrbita);
    super.dibujar(g);
  }

  public int getAnchoOrbita() {
    return anchoOrbita;
  }

  public int getAltoOrbita() {
    return altoOrbita;
  }
  
  
  
}
