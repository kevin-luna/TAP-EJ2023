/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelComponentes extends JPanel{
  public PanelComponentes(){
      this.setBackground(Color.CYAN);
      addComponentes();
    }
    
    public final void addComponentes(){
      this.setLayout(null);
      JButton boton = new JButton("Primer Boton");
      boton.setSize(150,40);
      boton.setLocation(50,50);
      add(boton);
      
      JLabel etiqueta = new JLabel("Este es un mensaje");
      etiqueta.setBounds(300,50,200,40);
      add(etiqueta);
      
      JTextField campo = new JTextField("Valor de entrada");
      campo.setBounds(50,120,200,40);
      add(campo);
      
      JTextArea area = new JTextArea(30,3);
      area.setBackground(Color.LIGHT_GRAY);
      area.setText("Captura de texto en varias lineas");
      area.setBounds(300,120,200,80);
      area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      add(area);
      
      JCheckBox ch1 = new JCheckBox("Uno",true);
      ch1.setSelected(true);
      ch1.setBounds(50,260,100,30);
      ch1.setBackground(this.getBackground());
      add(ch1);
      
      JCheckBox ch2 = new JCheckBox();
      ch2.setText("Dos");
      ch2.setBounds(50,290,100,30);
      add(ch2);
      
      JCheckBox chA = new JCheckBox("Azul",true);
      chA.setBounds(300,260,100,30);
      chA.setBackground(this.getBackground());
      add(chA);
      JCheckBox chB = new JCheckBox("Verde",true);
      chB.setBounds(420,260,100,30);
      add(chB);
      JCheckBox chC = new JCheckBox("Amarillo",true);
      chC.setBounds(540,260,100,30);
      add(chC);
      
      ButtonGroup grupo = new ButtonGroup();
      grupo.add(chA);
      grupo.add(chB);
      grupo.add(chC);
      
      JComboBox sel = new JComboBox();
      sel.addItem("Azul");
      sel.addItem("Verde");
      sel.addItem("Amarillo");
      sel.setSelectedIndex(1);
      sel.setBounds(50,340,100,30);
      add(sel);
      
      String[] elementos ={
        "Opcion 1","Opcion 2",
        "Opcion 3","Opcion 4",
        "Opcion 5","Opcion 6"
      };
      JList lista = new JList(elementos);
      lista.setBounds(300,340,100,150);
      add(lista);
    }
}
