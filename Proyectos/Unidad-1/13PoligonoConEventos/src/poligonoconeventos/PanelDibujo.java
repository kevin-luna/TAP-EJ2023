/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonoconeventos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelDibujo extends JPanel{
  
  private int lados;
  
  public PanelDibujo(){
    setBackground(Color.CYAN);
    //lados=3;
  }
  
  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    int radio = Math.min(alto, alto)/2-30;
    g.translate(ancho/2, alto/2);
    g.drawOval(-radio,-radio,2*radio,2*radio);
    if(lados>2){
      double angulo = 2*Math.PI/lados;
      int []x = new int[lados];
      int []y = new int[lados];
      for(int i=0;i<lados;i++){
        x[i]=(int)(radio*Math.cos(angulo*i));
        y[i]=(int)(radio*Math.sin(angulo*i));
      }
      g.fillPolygon(x,y,lados);
    }
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
