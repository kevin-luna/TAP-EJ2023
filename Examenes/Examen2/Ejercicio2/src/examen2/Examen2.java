/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package examen2;

import java.awt.BorderLayout;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaMalla ventana = new VentanaMalla();
        PanelConMalla panel = new PanelConMalla();
        OyenteMenu oyente = new OyenteMenu(ventana,panel);
        ventana.add(panel,BorderLayout.CENTER);
        ventana.addEventos(oyente);
        ventana.setLocation(100,100);
        ventana.setSize(800,600);
        ventana.setVisible(true);
    }

}
