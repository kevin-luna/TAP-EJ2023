/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteVentana implements ActionListener{

  private VentanaMonedas ventana;

  public OyenteVentana(VentanaMonedas ventana) {
    this.ventana = ventana;
  }
  
  
  
  @Override
  public void actionPerformed(ActionEvent e) {
    JTextField campoCantidad = ventana.getCampoCantidad();
    String texto = campoCantidad.getText();
      try{
      int cantidad = Integer.parseInt(texto);
        convertirEnBilletes(cantidad);
        
      }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(ventana, "Captura solo números", "Error de captura",JOptionPane.ERROR_MESSAGE);
        campoCantidad.setText("");
      }
  }
  
  private void convertirEnBilletes(int cantidad){
    int denominaciones[] = new int[]{1,2,5,10,20,50,100,200,500};
    JTextField campos[] = ventana.getCampos();
    for(int i=8;i>=0;i--){
      if(cantidad==0){
        campos[i].setText(Integer.toString(0));
        continue;
      }
      int monedas = cantidad/denominaciones[i];
      campos[i].setText(Integer.toString(monedas));
      cantidad%=denominaciones[i];
    }
  }
  
}
