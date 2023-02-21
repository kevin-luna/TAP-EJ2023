/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contextografico;

import java.awt.Graphics;
import javax.swing.JPanel;
import static java.awt.Color.*;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelArcos extends JPanel {

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    g.setColor(RED);
    g.drawRect(40, 35, 80, 80);
    g.drawRect(160, 35, 80, 80);
    g.drawRect(180, 35, 80, 80);

    g.setColor(BLACK);
    g.drawArc(40, 35, 80, 80, 0, 360);
    g.drawArc(160, 35, 80, 80, 0, 110);
    g.drawArc(280, 35, 80, 80, 0, -270);
    
    g.setColor(ORANGE);
    g.fillArc(40, 150, 80, 70, 0, 360);
    g.fillArc(160, 150, 80, 70, 270, -90);
    g.fillArc(280, 150, 80, 70, 0, -270);
    
    g.setColor(BLACK);
    g.drawArc(40, 150, 80, 70, 0, 360);
    g.drawArc(160, 150, 80, 70, 270, -90);
    g.drawArc(280, 150, 80, 70, 0, -270);
    g.drawLine(160, 185, 200, 185);
    g.drawLine(200, 185, 200, 220);
  }
}
