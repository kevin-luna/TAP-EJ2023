/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class BarraConImagenes extends JMenuBar {

  public BarraConImagenes() {
    addMenus();
  }

  public final void addMenus() {
    JMenu menuArchivo = new JMenu("Archivo");
    menuArchivo.setMnemonic('A');
    add(menuArchivo);
    JMenu menuEdicion = new JMenu("Editar");
    menuEdicion.setMnemonic('D');
    add(menuEdicion);
    
    //Objetos reusables
    KeyStroke tecla;
    ImageIcon icono;

    JMenuItem abrir = new JMenuItem("Abrir");
    tecla = KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK);
    abrir.setAccelerator(tecla);
    icono = new ImageIcon(this.getClass().getResource("/imagenes/abrir.png"));
    abrir.setIcon(icono);
    menuArchivo.add(abrir);
    
    JMenuItem guardar = new JMenuItem("Guardar");
    tecla = KeyStroke.getKeyStroke('G',InputEvent.CTRL_DOWN_MASK);
    guardar.setAccelerator(tecla);
    guardar.setMnemonic('G');
    icono = new ImageIcon(this.getClass().getResource("/imagenes/guardar.png"));
    guardar.setIcon(icono);
    menuArchivo.add(guardar);
    
    menuArchivo.addSeparator();
    
    JMenuItem salir = new JMenuItem("Salir");
    tecla = KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK);
    salir.setAccelerator(tecla);
    salir.setMnemonic('S');
    icono = new ImageIcon(this.getClass().getResource("/imagenes/salir.png"));
    salir.setIcon(icono);
    menuArchivo.add(salir);

    JMenuItem copiar = new JMenuItem("Copiar");
    tecla = KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK);
    copiar.setAccelerator(tecla);
    copiar.setMnemonic('C');
    icono = new ImageIcon(this.getClass().getResource("/imagenes/copiar.png"));
    copiar.setIcon(icono);
    menuEdicion.add(copiar);
    
    JMenuItem cortar = new JMenuItem("Cortar");
    tecla = KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK);
    cortar.setAccelerator(tecla);
    cortar.setMnemonic('X');
    icono = new ImageIcon(this.getClass().getResource("/imagenes/cortar.png"));
    cortar.setIcon(icono);
    menuEdicion.add(cortar);
    
    JMenuItem pegar = new JMenuItem("Pegar");
    tecla = KeyStroke.getKeyStroke('P',InputEvent.CTRL_DOWN_MASK);
    pegar.setAccelerator(tecla);
    pegar.setMnemonic('P');
    icono = new ImageIcon(this.getClass().getResource("/imagenes/pegar.png"));
    pegar.setIcon(icono);
    menuEdicion.add(pegar);
    
//    URL url = getClass().getResource("/imagenes/duke-unam.jpeg");
//    ImageIcon imagen = new ImageIcon(url);
//    copiar.setIcon(imagen);
  }
}
