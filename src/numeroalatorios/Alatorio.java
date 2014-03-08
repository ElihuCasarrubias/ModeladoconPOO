/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroalatorios;

import javax.swing.JOptionPane;

/**
 *
 * @author dapok
 */
public class Alatorio {
    //private int dato,x,y,num;
    //private int[] numeros;
    private String l;
    
   
    public Alatorio(){
    }
    
    public int getValor(){
    return (int)(Math.random()*45);
    }
    
    public double getEntredos(double x, double y) {
        return (int)(Math.random()*(y-x+1)+x);
    }
    

    public String getVarios(int n, int x, int y) {
        int[] numeros = new int[n];
    
        boolean valido;
        int i=0, num;
        while(i<n){
            num = (int)(Math.random()*(y-x+1)+x);
            //System.out.println("Cantidad " + (y-x+1));
            
            valido=false;
            for (int j = 0; j <= i; j++) {
               if(numeros[j] == num){
                   
                   valido=false;
                   //System.out.println(valido);
                   j=i+1; //se termine el for
                  break; 
               } else {
                 if(i == j){
                     numeros[i] = num; 
                     valido=true;
                     //System.out.println(valido);
                     j=i+1; //se termine el for
                     break;
                 }
              }
            }
       System.out.println(valido);
       if(valido)
          i++;
        
        }
        l=" ";
        for (int j = 0; j < numeros.length; j++) {
            l = l  + numeros[j] + " ,";
    }
        return l;
}
}