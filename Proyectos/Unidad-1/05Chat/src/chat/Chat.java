/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package chat;

/**
 *
 * @author Kevin Alejandro Gutierrez Luna
 */
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaChat f = new VentanaChat();
        PanelChat panel = new PanelChat();
        f.setSize(800,600);
        f.setContentPane(panel);
        f.setLocation(100,100);
        f.setVisible(true);
    }

}
