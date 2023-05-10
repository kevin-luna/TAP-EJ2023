/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package examene3;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class ExamenE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaGrafica f = new VentanaGrafica();
        PanelGrafica panel = new PanelGrafica();
        f.add(panel);
        f.setLocation(100,100);
        f.setSize(800,600);
        f.setVisible(true);
    }

}
