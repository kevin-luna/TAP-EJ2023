/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simbolo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelSimbolo extends JPanel {

  public PanelSimbolo() {
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    g.translate(ancho / 2, alto / 2);  // Se mueve el origen al centro del panel
    // Círculo amarillo
    int rExterior = 250;
    g.setColor(Color.YELLOW);
    g.fillOval(-rExterior, -rExterior, 2 * rExterior, 2 * rExterior);
  }
}
