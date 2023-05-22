/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package contadores;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Contadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int contador=1;contador<=2;contador++){
          String nombre = "C"+contador;
          System.out.println("Contador"+nombre);
          System.out.println("Inicia contador "+nombre);
          imprimir(nombre);
          System.out.println("Termina contador "+nombre);
        }
        System.out.println("Termina el método main()");
    }

    public static void imprimir(String nombre){
      for(int i=0;i<10;i++){
        System.out.println(nombre+" = "+i);
        try{
          Thread.sleep(1000);
        }catch(InterruptedException ex){
          System.out.println("Error de interrupción del proceso!!"+ex);
        }
      }
    }
}
