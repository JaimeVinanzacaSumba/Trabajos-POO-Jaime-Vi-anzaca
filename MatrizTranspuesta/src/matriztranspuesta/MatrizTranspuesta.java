/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriztranspuesta;
import java.util.*; 
/**
 *
 * @author jaime andres
 */
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int columnas;
        int filas;
        
        System.out.println("Ingrese tamano de matriz");
        System.out.println("columnas: ");
        columnas = leer.nextInt();
        System.out.println("Filas: ");
        filas = leer.nextInt();
        
        int matriz [][] = new int [columnas][filas];
        
        if(columnas == filas){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println("Ingrese posicion: "+i+","+j);
                    matriz[i][j] = leer.nextInt();
                }
            }
            
            System.out.println("Su matriz es: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j]+" | ");
                }
                System.out.println();
            }
            
            System.out.println("Su transpuesta es: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[j][i]+" | ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Ingrese una matriz cuadrada");
        }
    }
    
}
