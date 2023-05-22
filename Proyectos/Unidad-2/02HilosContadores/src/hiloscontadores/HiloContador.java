/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hiloscontadores;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class HiloContador extends Thread {

  public HiloContador(String nombre) {
    this.setName(nombre);
  }

  public void imprimir(String nombre) {
    for (int i = 0; i < 10; i++) {
      System.out.println(nombre + " = " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        System.out.println("Error de interrupción del proceso!!" + ex);
      }
    }
  }

  @Override
  public void run(){
    imprimir(this.getName());
  }
  
}
