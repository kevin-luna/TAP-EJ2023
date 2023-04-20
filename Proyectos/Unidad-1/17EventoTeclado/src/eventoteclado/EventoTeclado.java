/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package eventoteclado;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Figura;
import vistas.PanelDibujable;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class EventoTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura circulo = new Circulo(300,350,50,Color.BLUE);
        PanelDibujable panel = new PanelDibujable(circulo);
        OyenteTeclado oyente = new OyenteTeclado(circulo,panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Eventos de teclado");
        f.setSize(800,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
