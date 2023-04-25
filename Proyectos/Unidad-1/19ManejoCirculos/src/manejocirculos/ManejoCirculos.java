/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package manejocirculos;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class ManejoCirculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Manejo de Circulos");
        Circulos circulos = new Circulos();
        circulos.add(new Circulo(300,400,50,Color.BLUE));
        PanelDibujable panel = new PanelDibujable(circulos);
        OyenteCirculos oyente = new OyenteCirculos(circulos,panel);
        panel.addEventos(oyente);
        f.setSize(800,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
