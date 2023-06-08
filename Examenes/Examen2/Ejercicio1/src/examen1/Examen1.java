/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package examen1;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaMonedas ventana = new VentanaMonedas();
        OyenteVentana oyente = new OyenteVentana(ventana);
        ventana.addEventos(oyente);
        ventana.setLocation(100, 100);
        ventana.setSize(800,600);
        ventana.setVisible(true);
    }

}
