/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarcadafilaycolumnadeunamatriz;

import java.util.Scanner;

/**
 *
 * @author jaime andres
 */
public class SumarCadaFilaYColumnaDeUnaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int columnas;
        int filas;
        int sumaFil = 0;
        int sumaCol = 0;
        
        System.out.println("Ingrese tamano de matriz");
        System.out.println("Filas: ");
        filas = leer.nextInt();
        System.out.println("columnas: ");
        columnas = leer.nextInt();
        
        int matriz [][] = new int [filas][columnas];
        
        
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.println("Ingrese posicion: "+i+","+j);
                    matriz[i][j] = leer.nextInt();
                }
            }
            
            System.out.println("Su matriz es: ");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j]+" | ");
                }
                System.out.println();
            }
            
            for (int i = 0; i < (filas); i++) {
                sumaFil = 0;
                for (int j = 0; j < (columnas); j++) {
                    sumaFil += matriz[i][j];
                }
                System.out.println("La suma de la fila: "+i+" es: "+sumaFil);
            }
            System.out.println();
            
            for (int j = 0; j < (columnas); j++) {
                sumaCol = 0;
                for (int i = 0; i < (filas); i++) {
                    sumaCol += matriz[i][j];
                }
                System.out.println("La suma de la columna: "+j+" es: "+sumaCol);
            }
            System.out.println();

        
    }
    
}
