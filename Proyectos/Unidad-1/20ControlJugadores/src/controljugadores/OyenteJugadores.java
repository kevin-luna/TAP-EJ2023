/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controljugadores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import modelos.Jugadores;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteJugadores implements ActionListener {

  private Jugadores jugadores; // Modelo de datos
  private VentanaJugadores vista;

  public OyenteJugadores(Jugadores jugadores,VentanaJugadores vista) {
      this.jugadores = jugadores;
      this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    //System.out.println(e.getActionCommand());
    
    Component origen = (Component)e.getSource();
    switch(origen.getName()){
      case "abrir":{
        abrirArchivo();
        break;
      }
    }
  }
  
  public void abrirArchivo(){
    JFileChooser seleccion = new JFileChooser();
    int opcion = seleccion.showOpenDialog(vista);
    if(opcion == JFileChooser.APPROVE_OPTION){
      System.out.println(seleccion.getSelectedFile().getName());
    }
  }
}
