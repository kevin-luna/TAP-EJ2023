/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelos.Imagenes;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelAnimacion extends JPanel{
  private Imagenes imagenes;
  private JLabel etiqueta;

  public PanelAnimacion(Imagenes imagenes) {
    this.imagenes = imagenes;
    setBackground(Color.cyan);
    addComponentes();
  }
  
  public void addEventos(MouseAdapter oyente){
    this.addMouseWheelListener(oyente);
  }
  
  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Image activa = imagenes.getActiva();
    int x = (this.getWidth()-activa.getWidth(null))/2;
    int y = (this.getHeight()-activa.getHeight(null))/2;
    imagenes.setLocation(x, y);
    imagenes.dibujar(g);
  }
  
  public void addComponentes(){
    etiqueta = new JLabel();
    etiqueta.setFont(new Font("Liberation Sans",Font.BOLD,48));
    add(etiqueta);
  }

  public JLabel getEtiqueta() {
    return etiqueta;
  }
  
  
}
