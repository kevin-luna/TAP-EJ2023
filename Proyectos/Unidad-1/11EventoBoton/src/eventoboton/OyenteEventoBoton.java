package eventoboton;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteEventoBoton implements ActionListener {
    private JPanel panel;
    
    public OyenteEventoBoton(JPanel panel) {
        this.panel=panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        /*String texto = e.getActionCommand();
        switch(texto){
            case "Cambiar fondo a Azul":
                panel.setBackground(Color.BLUE);
                break;
            case "Cambiar fondo a Verde":
                panel.setBackground(Color.GREEN);
                break;
        }*/
        Component origen = (Component) e.getSource();
        switch(origen.getName()) {
            case "azul" -> panel.setBackground(Color.BLUE);
            case "verde" -> panel.setBackground(Color.GREEN);
        }
    }
    
}
