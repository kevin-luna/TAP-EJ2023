/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contextografico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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

    Font f1 = new Font("Times New Roman", Font.BOLD, 24);
    g.setFont(f1);
    g.setColor(Color.RED);
    g.drawString("Mensaje en Times New Roman", 20, 450);
    System.out.println(g.getFont().getSize());
    System.out.println(g.getFont().getFontName());

    Font f2 = new Font("New Courier", Font.BOLD | Font.ITALIC, 18);
    g.setFont(f2);
    g.setColor(Color.MAGENTA);
    g.drawString("Mensaje en Courier", 400, 450);
    System.out.println(g.getFont().getSize());
  }
}
