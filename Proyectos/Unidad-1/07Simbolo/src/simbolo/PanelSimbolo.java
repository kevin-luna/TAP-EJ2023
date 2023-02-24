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
        g.setColor(Color.BLACK);
        g.drawOval(-rExterior, -rExterior, 2 * rExterior, 2 * rExterior);
        // Arcos
        int rArcos = 230;
        //   g.fillArc(-rArcos, -rArcos, rArcos * 2, rArcos * 2, 0, 60);
        //   g.fillArc(-rArcos, -rArcos, rArcos * 2, rArcos * 2, 120, 60);
        //   g.fillArc(-rArcos, -rArcos, rArcos * 2, rArcos * 2, 240, 60);   
        int nArcos = 3;
        int factor = 360 / nArcos;
        for (int i = 0; i < nArcos; i++) {
            g.fillArc(-rArcos, -rArcos, rArcos * 2, rArcos * 2, factor * i, factor / 2);
        }
        // Círculo amarillo interior
        int rInterior = 100;
        g.setColor(Color.YELLOW);
        g.fillOval(-rInterior, -rInterior, rInterior * 2, rInterior * 2);
        // Círculo negro interior
        int rCentro = 80;
        g.setColor(Color.BLACK);
        g.fillOval(-rCentro, -rCentro, rCentro * 2, rCentro * 2);
    }
}
