 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimirenorden5numerosdeunarreglo;

import java.util.Scanner;

/**
 *
 * @author jaime andres
 */

/*
    Leer 5 numeros guardarlos en un arreglo y mostrarlos 
    en el mismo orden introducido
*/
public class ImprimirEnOrden5NumerosDeUnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int tamaño = 0;
        
        System.out.println("Ingrese tamaño del arreglo");
        tamaño = leer.nextInt();
        
        int [] arreglos = new int[tamaño];
        
        for (int i = 0; i < arreglos.length; i++) {
            System.out.println("Ingrese dato: "+(i+1));
            arreglos[i] = leer.nextInt();
        }
        
        for(int Datos : arreglos){
            System.out.print(Datos+" | ");
        }
        
        System.out.println();
        
    }
    
}
