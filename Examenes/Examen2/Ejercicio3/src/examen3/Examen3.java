/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package examen3;

import java.awt.BorderLayout;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPoligono f = new VentanaPoligono();
        PanelDibujo panel = new PanelDibujo();
        OyenteVentana oyente = new OyenteVentana(f,panel);
        panel.setLados(3);
        f.add(panel,BorderLayout.CENTER);
        f.addEventos(oyente);
        f.setSize(800,600);
        f.setLocation(100,100);
        f.setVisible(true);
        
    }

}
