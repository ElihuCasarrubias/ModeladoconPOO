/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroalatorios;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dapok
 */
public class NumeroAlatorios {
    private static Object listaNumero;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Bienvenidos vamos \n a General Numeros");
        JOptionPane.showMessageDialog(null, "Primer Ejercio Generar un Numero Aleatorio");
        Alatorio alatorio1 =new Alatorio();
        JOptionPane.showMessageDialog(null," Numero Generado = " + alatorio1.getValor());
        
        JOptionPane.showMessageDialog(null, "inicia el segundo ejercicio");
        double x = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor inicial"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Dame el  segundo valor"));
        Alatorio alatorio2 = new Alatorio();
        JOptionPane.showMessageDialog(null, "Numero Generado entre los dos valores " + alatorio2.getEntredos(x, y));
        
       JOptionPane.showMessageDialog(null, "Inicia el Tercer ejercio"); 
       Alatorio alatorio3 = new Alatorio();
       int numgenerar= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numero a generar"));
       int n = Integer.parseInt( JOptionPane.showInputDialog("Dame el valor inicial"));
       int n1 = Integer.parseInt( JOptionPane.showInputDialog("Dame el valor final"));
       JOptionPane.showMessageDialog(null, "Numero Generado entre los dos valores " + alatorio3.getVarios(numgenerar, n, n1) );
       
        }
}
