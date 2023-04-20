/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package eventoraton;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Figura;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class EventoRaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo modelo = new Circulo(300,350,50,Color.BLUE); //Modelo
        PanelDibujable panel = new PanelDibujable(modelo); //Vista
        OyenteRaton oyente = new OyenteRaton(modelo,panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Eventos de raton");
        f.setSize(800,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
