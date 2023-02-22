/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contextografico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelLetras extends JPanel {

  public PanelLetras() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.BLUE);
    g.drawString("Mensaje en azul", 20, 20);
    g.setColor(new Color(100, 100, 0));
    g.drawString("Mensaje en otro color", 400, 20);
    System.out.println(g.getFont().getFontName());
    System.out.println(g.getFont().getSize());

    Font f1 = new Font("JetBrains Mono", Font.BOLD, 24);
    g.setFont(f1);
    g.setColor(Color.RED);
    g.drawString("Mensaje en JetBrains Mono", 20, 450);
    System.out.println(g.getFont().getSize());
    System.out.println(g.getFont().getFontName());

    Font f2 = new Font("New Courier", Font.BOLD | Font.ITALIC, 18);
    g.setFont(f2);
    g.setColor(Color.MAGENTA);
    g.drawString("Mensaje en Courier", 400, 450);
    System.out.println(g.getFont().getSize());

    String nombre = "/imagenes/duke-abbey.jpeg";
    ImageIcon img = new ImageIcon(getClass().getResource(nombre));
    Image imagen = img.getImage();
    
    //Inserta la imagen en la esquina superior izquierda
    //g.drawImage(imagen, 0, 0, this);

    int anchoPanel = this.getWidth();
    int altoPanel = this.getHeight();
    int anchoImagen = imagen.getWidth(this);
    int altoImagen = imagen.getHeight(this);
    int xC = anchoPanel / 2;
    int yC = altoPanel / 2;
    int x = xC - anchoImagen / 2;
    int y = yC - altoImagen / 2;
    //Centra la imagen con respecto al panel
    g.drawImage(imagen, x, y, this);
    
    //Ajusta la imagen a las dimensiones del panel
    //g.drawImage(imagen, 0, 0, anchoPanel, altoPanel, this);
  }
}
