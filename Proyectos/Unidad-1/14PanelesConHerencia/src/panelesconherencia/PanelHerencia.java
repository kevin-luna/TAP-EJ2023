/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panelesconherencia;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTabbedPane;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class PanelHerencia extends JTabbedPane{
    public PanelHerencia(){
        addComponentes();
    }
    
    private void addComponentes(){
        setBackground(Color.LIGHT_GRAY);
        setBorder(BorderFactory.createLineBorder(getBackground(),20));
        setOpaque(true);
    }
}
