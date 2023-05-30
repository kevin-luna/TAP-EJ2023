/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package hiloscontadoresgrafico;

import javax.swing.JFrame;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class HilosContadoresGrafico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Contadores");
        PanelContador panel = new PanelContador();
        OyenteContador oyente = new OyenteContador(panel);
        panel.addEventos(oyente);
        f.setSize(400,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
