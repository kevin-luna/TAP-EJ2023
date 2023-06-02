/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package trayectorias;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelos.Planetas;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Trayectorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Trayectorias");
        Planetas planetas = new Planetas();
        PanelTrayectorias panel = new PanelTrayectorias(planetas);
        OyenteTrayectorias oyente = new OyenteTrayectorias(planetas,panel);
        panel.addEventos(oyente);
        f.add(panel);
        f.setLocation(100,100);
        f.setSize(800,600);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
