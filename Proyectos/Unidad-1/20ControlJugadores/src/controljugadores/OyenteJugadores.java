/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controljugadores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.Jugador;
import modelos.Jugadores;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class OyenteJugadores extends WindowAdapter implements ActionListener {

  public static final boolean NOMBRE_ON = true;
  public static final boolean NOMBRE_OFF = false;
  public static final boolean COMBOS_ON = true;
  public static final boolean COMBOS_OFF = false;

  private Jugadores jugadores; // Modelo de datos
  private VentanaJugadores vista; //Vista
  private DefaultTableModel datosTabla; //Modelo de tabla
  private DialogoRegistroJugador dialogo;

  public OyenteJugadores(Jugadores jugadores, VentanaJugadores vista) {
    this.jugadores = jugadores;
    this.vista = vista;
    datosTabla = vista.getDatosTabla();
    dialogo = new DialogoRegistroJugador(vista, true);
    dialogo.addEventos(this);
  }

  public void windowClosing(WindowEvent e) {
    Component origen = (Component) e.getSource();
    switch (origen.getName()) {
      case "ventana": {
        salirPrograma();
        break;
      }
      case "dialogo": {
        dialogo.setVisible(false);
        break;
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    //System.out.println(e.getActionCommand());

    Component origen = (Component) e.getSource();
    switch (origen.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }
      case "guardar": {
        grabarArchivo();
        break;
      }
      case "salir": {
        salirPrograma();
        break;
      }
      case "registrar": {
        registrarJugador();
        break;
      }
      case "editar": {
        editarJugador();
        break;
      }
      case "eliminar": {
        eliminarJugador();
        break;
      }
      case "inicializar": {
        inicializarValores();
        break;
      }
      case "aceptar": {
        break;
      }
      case "cancelar": {
        dialogo.setVisible(false);
        break;
      }
    }
  }
  
  public void actualizarJugadores(){
    
  }
  
  public void inicializarValores(){
    int seleccion = mostrarMensajeSeleccion("Eliminar jugadores","¿Desea cepillar a todos los jugadores?");
    if(seleccion==JOptionPane.YES_OPTION){
      jugadores.inicializarJugadores();
      datosTabla.setRowCount(0);
      vista.actualizarEtiquetas();
    }
  }
  
  public void editarJugador(){
    if(validarJugador())
        dialogo.show("Editar jugador", "Modificar", NOMBRE_OFF, COMBOS_ON);
  }
  
  public void eliminarJugador(){
    if(validarJugador())
        dialogo.show("Eliminar jugador", "Eliminar", NOMBRE_OFF, COMBOS_OFF);
  }
  
  public boolean validarJugador(){
    int renglon = vista.getTabla().getSelectedRow();
    if(renglon!=-1){
      String[] valores = {
      (String) datosTabla.getValueAt(renglon, 0),
        (String) datosTabla.getValueAt(renglon, 1),
        (String) datosTabla.getValueAt(renglon, 2),
        (String) datosTabla.getValueAt(renglon, 3),
        (String) datosTabla.getValueAt(renglon, 4),
        (String) datosTabla.getValueAt(renglon, 5),
      };
      dialogo.setComponentes(valores);
    }else{
      mostrarMensajeError("Error de registro","Debes seleccionar un registro de la tabla!!");
      return false;
    }
    return true;
  }

  public void registrarJugador() {
    String[] valores = {"","Soleado","Calor","Baja","Si","Si"};
    dialogo.setComponentes(valores);
    dialogo.show("Registrar jugador", "Adicionar", NOMBRE_ON, COMBOS_ON);
  }

  public void salirPrograma() {
    int seleccion = mostrarMensajeSeleccion("Salir del programa", "¿Desea salir del programa?");
    if (seleccion == JOptionPane.YES_NO_OPTION) {
      System.exit(0);
    }
  }

  public void grabarArchivo() {
    JFileChooser seleccion = new JFileChooser();
    int opcion = seleccion.showSaveDialog(vista);
    if (opcion == JFileChooser.APPROVE_OPTION) {
      File archivo = seleccion.getSelectedFile();
      jugadores.grabarJugadores(archivo);
    }
    vista.actualizarEtiquetas();
  }

  public void abrirArchivo() {
    JFileChooser seleccion = new JFileChooser();
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo CSV", "csv");
    seleccion.setFileFilter(filtro);
    int opcion = seleccion.showOpenDialog(vista);
    if (opcion == JFileChooser.APPROVE_OPTION) {
      //System.out.println(seleccion.getSelectedFile().getName());
      jugadores.leerJugadores(seleccion.getSelectedFile());
      datosTabla.setNumRows(0);
      for (Jugador jugador : jugadores.values()) {
//        System.out.println(jugador);
        datosTabla.addRow(jugador.getJugador());
      }
      vista.actualizarEtiquetas();
    }
  }

  public void mostrarMensajeError(String titulo, String mensaje) {
    JOptionPane.showMessageDialog(vista, mensaje, titulo, JOptionPane.OK_OPTION);
  }

  public int mostrarMensajeSeleccion(String titulo, String mensaje) {
    return JOptionPane.showConfirmDialog(vista, mensaje, titulo, JOptionPane.YES_NO_OPTION);
  }
}
