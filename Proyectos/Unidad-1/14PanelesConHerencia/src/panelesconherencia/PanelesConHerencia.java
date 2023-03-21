/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panelesconherencia;

import javax.swing.JFrame;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelesConHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Paneles con herencia");
        PanelHerencia panel = new PanelHerencia();
        f.add(panel);
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
