/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rebotes;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteRebotes extends MouseAdapter{
  private Circulos circulos;
  private PanelDibujable panel;

  public OyenteRebotes(Circulos circulos, PanelDibujable panel) {
    this.circulos = circulos;
    this.panel = panel;
  }
  
  public void mouseClicked(MouseEvent e){
    int radio = 5+(int)(Math.random()*26);
    int rojo = (int)(Math.random()*256);
    int verde = (int)(Math.random()*256);
    int azul = (int)(Math.random()*256);
    Circulo circulo = new Circulo(e.getX(),e.getY(),radio,new Color(rojo,verde,azul));
    new HiloMovimiento(circulo).start();
    circulos.add(circulo);
    panel.repaint();
  }
  
  public class HiloMovimiento extends Thread{
    private Circulo circulo;
    
    public HiloMovimiento(Circulo circulo){
      this.circulo = circulo;
    }
    
    public void run(){
      int incX = 5+(int)(Math.random()*11);
      int incY = 5+(int)(Math.random()*11);
      int signoX = Math.random()>0.5 ? 1:-1;
      int signoY = Math.random()>0.5 ? 1:-1;
      int tiempo = 50;
      int radio = circulo.getRadio();
      while(true){
        int ancho = panel.getWidth();
        int alto = panel.getHeight();
        circulo.x += incX*signoX;
        circulo.y += incY*signoY;
        if(circulo.x+radio>ancho || circulo.x-radio<0){
          signoX*=-1;
        }
        if(circulo.y+radio>alto || circulo.y-radio<0){
          signoY*=-1;
        }
        try{
          Thread.sleep(tiempo);
        }catch(InterruptedException ex){
          System.out.println("Error de interrupción "+ex);
          System.exit(-1);
        }
        panel.repaint();
        Toolkit.getDefaultToolkit().sync();
      }
    }
  }
}
