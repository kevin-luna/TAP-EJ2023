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

    JMenuItem abrir = new JMenuItem("Abrir");
    KeyStroke tecla = KeyStroke.getKeyStroke('A',
      InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK);
    abrir.setAccelerator(tecla);
    menuArchivo.add(abrir);
    JMenuItem guardar = new JMenuItem("Guardar");
    guardar.setMnemonic('G');

    menuArchivo.add(guardar);
    menuArchivo.addSeparator();
    menuArchivo.add(new JMenuItem("Salir"));

    JMenuItem copiar = new JMenuItem("Copiar");
    tecla = KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK);
    copiar.setAccelerator(tecla);
    copiar.setMnemonic('C');
    String imagen = "/imagenes/copy-icon.jpeg";
    ImageIcon icono = new ImageIcon(this.getClass().getResource(imagen));
    copiar.setIcon(icono);
    menuEdicion.add(copiar);
    
    JMenuItem cortar = new JMenuItem("Cortar");
    tecla = KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK);
    cortar.setAccelerator(tecla);
    cortar.setMnemonic('X');
    ImageIcon iconoCortar = new ImageIcon(this.getClass().getResource("/imagenes/cut-icon.jpeg"));
    cortar.setIcon(iconoCortar);
    menuEdicion.add(cortar);
    
    JMenuItem pegar = new JMenuItem("Pegar");
    tecla = KeyStroke.getKeyStroke('P',InputEvent.CTRL_DOWN_MASK);
    pegar.setAccelerator(tecla);
    pegar.setMnemonic('P');
    ImageIcon iconoPegar = new ImageIcon(this.getClass().getResource("/imagenes/paste-icon.jpeg"));
    pegar.setIcon(iconoPegar);
    menuEdicion.add(pegar);
//    URL url = getClass().getResource("/imagenes/duke-unam.jpeg");
//    ImageIcon imagen = new ImageIcon(url);
//    copiar.setIcon(imagen);


  }
}
