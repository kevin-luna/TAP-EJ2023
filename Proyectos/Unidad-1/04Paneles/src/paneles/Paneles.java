/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package paneles;

import javax.swing.JFrame;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Paneles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Ventana con paneles");
        BarraConImagenes barra = new BarraConImagenes();
        PanelMezclado panel = new PanelMezclado();
        f.setJMenuBar(barra);
        f.setContentPane(panel);
        f.setSize(800,600);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

}
