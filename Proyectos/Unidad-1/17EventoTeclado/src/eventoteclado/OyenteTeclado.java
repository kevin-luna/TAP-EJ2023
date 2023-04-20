/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventoteclado;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyEvent;
import modelos.Circulo;
import modelos.Figura;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteTeclado extends KeyAdapter {

  private Figura modelo;
  private PanelDibujable vista;

  public OyenteTeclado(Figura modelo, PanelDibujable vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    //System.out.println("Tecla = "+e.getKeyCode());
    int codigo = e.getKeyCode();
    int inc = 5;
    Circulo circulo = (Circulo) modelo;
    //System.out.println("El Color de la figura es: "+modelo.getColor().toString());
    int radio = circulo.getRadio();
    switch (codigo) {
      case VK_UP, VK_W: {
        if (modelo.y - radio - inc >= 0) {
          modelo.y -= inc;
          vista.repaint();
        }
        break;
      }
      case VK_DOWN, VK_S: {
        if (modelo.y + radio + inc <= vista.getHeight()) {

          modelo.y += inc;
          vista.repaint();
        }
        break;
      }
      case VK_LEFT, VK_A: {
        if (modelo.x - radio - inc >= 0) {
          modelo.x -= inc;
          vista.repaint();
        }
        break;
      }
      case VK_RIGHT, VK_D: {
        if (modelo.x + radio + inc <= vista.getWidth()) {

          modelo.x += inc;
          vista.repaint();
        }
        break;
      }
      case VK_1: {
        modelo.setColor(Color.BLUE);
        vista.repaint();
      }
      break;
      case VK_2: {
        modelo.setColor(Color.RED);
        vista.repaint();
      }
      break;
      case VK_PLUS: {
        circulo.setRadio(circulo.getRadio() + inc);
        vista.repaint();
      }
      break;
      case VK_MINUS: {
        circulo.setRadio(circulo.getRadio() - inc);
        vista.repaint();
      }
      break;
    }
  }
}
