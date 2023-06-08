/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteVentana implements ActionListener {
  
  private VentanaPoligono ventana;
  private PanelDibujo panel;

  public OyenteVentana(VentanaPoligono ventana, PanelDibujo panel) {
    this.ventana = ventana;
    this.panel = panel;
  }
  
  
  
  @Override
    public void actionPerformed(ActionEvent e){
      JButton boton = (JButton)e.getSource();
      int lados = panel.getLados();
      if(boton.getText().equals("Aumentar")){
        panel.setLados(lados+1);
      }else{
        if(panel.getLados()-1<=2){
          JOptionPane.showMessageDialog(ventana, "El minimo es 3", "Error",JOptionPane.ERROR_MESSAGE);
          return;
        }
        panel.setLados(lados-1);
      }
      panel.repaint();
    }
}
