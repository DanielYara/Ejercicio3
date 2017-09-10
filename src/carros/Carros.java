/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose Daniel Yara Sepulveda
 * @author Oscar Porras Junco
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Cuantos carros desea agregar? ");
         int CantidadCarros = input.nextInt();
        
        for (int i = 0; i < CantidadCarros; i++) {
          System.out.print("Escriba la marca del auto " + (i+1) + ":");
            String Nombre = input.next();
            
          System.out.print("Escriba la categoría del auto " + (i+1) + ":");
            String Categoria = input.next();
          
          System.out.print("Escriba el número de modelo del auto " + (i+1) + ":");
            int ModelNumber = input.nextInt();
            
          System.out.print("Introduzca el valor del auto "  + (i+1) + ":");
            int Price = input.nextInt();  
          
          System.out.print("Escriba el kilometraje del auto " + (i+1) + ":");
            int Traveled = input.nextInt();
            
          System.out.print("Escriba el modelo de auto " + (i+1) + ":");
            String model = input.next();
          }
        
        
        System.out.println();
            
            
          
          
        
//        System.out.println(Reporte.toString());
        
        
        
        
        
        
        
    }
    
}
