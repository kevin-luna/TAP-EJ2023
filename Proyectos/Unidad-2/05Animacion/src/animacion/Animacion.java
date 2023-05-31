/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package animacion;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelos.Imagenes;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Animacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imagenes imagenes = new Imagenes("dancing");
        PanelAnimacion panel = new PanelAnimacion(imagenes);
        OyenteAnimacion oyente = new OyenteAnimacion(imagenes,panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Animación");
        f.setLocation(100,100);
        f.setSize(800,600);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);
    }

}
