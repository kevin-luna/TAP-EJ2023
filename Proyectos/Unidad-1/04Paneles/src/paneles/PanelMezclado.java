/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelMezclado extends JTabbedPane{

  private final Border bordePanelTab;  //<== Borde para los paneles

  public PanelMezclado() {
    bordePanelTab = BorderFactory.createEtchedBorder();
    addComponentes();
  }

  private void addComponentes() {
    setBackground(Color.CYAN);
    setOpaque(true);
    setBorder(BorderFactory.createLineBorder(getBackground(), 50));
    addTab("Mezcla de paneles", mezclaPaneles());    //<===
    addTab("Panel con Border", addPanelConBorder()); //<===
    addTab("Panel con Malla", addPanelConMalla());  //<===
  }

  public Component mezclaPaneles() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(new JButton("Principal"), "Center");

    JPanel panelNorte = new JPanel();  //Un JPanel usa FlowLayout por omisión
    panelNorte.setBackground(Color.GRAY);

    panelNorte.add(new JButton("Aceptar"));
    panelNorte.add(new JButton("Cancelar"));

    panel.add(panelNorte, "North");
    return panel;
  }

  public Component addPanelConBorder() {
    JPanel panel = new JPanel();
    panel.setBorder(bordePanelTab);
    BorderLayout layout = new BorderLayout();
    layout.setHgap(10);
    layout.setVgap(15);
    panel.setLayout(layout);
//   panel.add(new JButton("Cancelar"), "North");
    panel.add(new JButton("Aceptar"), "North");
    panel.add(new JButton("Sur"), "South");
    panel.add(new JButton("Derecha"), "East");
    panel.add(new JButton("Izquerda"), "West");
    panel.add(BorderLayout.CENTER, new JButton("Otra cosa"));
    return panel;
  }

  public Component addPanelConMalla() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.GREEN);
    panel.setBorder(bordePanelTab);
    GridLayout layout = new GridLayout(2, 2); // 2 filas, 2 columnas
    panel.setLayout(layout);

    JButton boton1 = new JButton("Primer botón");
//   boton1.setBounds(100,100,300,50); // Con Layout, setBounds no funciona
    JButton boton2 = new JButton("Último botón");

    panel.add(new JButton("Otro botón"));  //<====
    panel.add(boton2);
    panel.add(boton1);
    return panel;
  }
}
