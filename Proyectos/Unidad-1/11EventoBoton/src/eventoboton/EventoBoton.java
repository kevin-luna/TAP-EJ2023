package eventoboton;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JFrame;
/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class EventoBoton {

    public static void main(String[] args) {
        JFrame f = new JFrame("Eventos de botón");
        PanelEventoBoton panel = new PanelEventoBoton();
        OyenteEventoBoton oyente = new OyenteEventoBoton(panel);
        panel.addEventos(oyente);
        f.setSize(800, 600);
        f.setLocation(100, 100);
        f.setDefaultCloseOperation(3);
        f.add(panel);
        f.setVisible(true);
        
    }

}
