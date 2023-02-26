/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelDibujo extends JPanel {

  public PanelDibujo() {
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = getWidth();
    int alto = getHeight();
    // Mover el origen al centro
    g.translate(ancho / 2, alto / 2);
    // Dibujar los ejes de coordendas
    g.drawLine(-ancho / 2, 0, ancho / 2, 0);
    g.drawLine(0, -alto / 2, 0, alto / 2);
    // Operador condicional  : expresion?valor:valor;
    int menor = ancho < alto ? ancho : alto;
    int lado = menor / 2 - 40;  //<==

    // Cuadrado con centro en el origen
    g.setColor(Color.BLUE);
    g.fillRect(-lado / 2, -lado / 2, lado, lado);
    g.setColor(Color.BLACK);
    g.drawRect(-lado / 2, -lado / 2, lado, lado);

    // Círculo con centro en el origen
    g.setColor(Color.CYAN);
    g.fillOval(-lado / 2, -lado / 2, lado, lado);
    g.setColor(Color.BLACK);
    g.drawOval(-lado / 2, -lado / 2, lado, lado);

    // Rombo inscrito en el cuadrado
    int[] pX = {0, -lado / 2, 0, lado / 2};
    int[] pY = {-lado / 2, 0, lado / 2, 0};
    g.setColor(Color.GREEN);
    g.fillPolygon(pX, pY, pX.length);
    g.setColor(Color.BLACK);
    g.drawPolygon(pX, pY, pX.length);

    // Círculo con centro en el origen
    int radio = lado; //<=======
    g.setColor(Color.GRAY);
    g.drawOval(-radio, -radio, 2 * radio, 2 * radio);

    // Dibujar rayos del centro a ocho puntos en el círculo
    g.setColor(Color.RED);
    for (int i = 0; i < 8; i++) {
      double rad = Math.toRadians(45 * i);
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      g.drawLine(0, 0, x, y);
    }

    // Dibujar líneas que unan los rayos
    g.setColor(Color.RED);
    int ax = radio;
    int ay = 0;
    for (int i = 1; i <= 8; i++) {
      double rad = Math.toRadians(45 * i);
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      g.drawLine(ax, ay, x, y);
      ax = x;
      ay = y;
    }

    g.setColor(Color.MAGENTA);
    int rInt = menor / 50;
    for (int i = 0; i < 8; i++) {
      double rad = Math.toRadians(45 * i);
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      g.fillOval(x - rInt, y - rInt, 2 * rInt, 2 * rInt);
    }
  }
}