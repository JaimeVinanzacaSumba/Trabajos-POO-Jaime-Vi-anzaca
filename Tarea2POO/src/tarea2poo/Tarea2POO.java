/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2poo;

/**
 *
 * @author jaime andres
 */
public class Tarea2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bucle while - Fibonaci");
         int num1 = 0;
         int num2 = 1;
         int aux;
         int contador = 3;
         int cantidad = 10;
         
         System.out.println(num1);
         System.out.println(num2);
         
         while(contador <= cantidad){
             aux = num1;
             num1 = num2;
             num2 = aux + num1;
             System.out.println(num2);
             contador++;
         }
         
         System.out.println("Bucle do-while - Fibonaci");
         int numer1 = 0;
         int numer2 = 1;
         int auxi;
         int contador1 = 3;
         int cantidad1 = 10;
         
         System.out.println(numer1);
         System.out.println(numer2);
         
         do{
             auxi = numer1;
             numer1 = numer2;
             numer2 = auxi + numer1;
             System.out.println(numer2);
             contador1++;
         }while(contador1 <= cantidad1);
         
         System.out.println("Bucle for - Fibonaci");
         int numero1 = 0;
         int numero2 = 1;
         int auxiliar;
         int cantidad2 = 10;
         
         System.out.println(numero1);
         System.out.println(numero2);
         
         for(int contador3 = 3; contador3 <= cantidad2; contador3++){
             auxiliar = numero1;
             numero1 = numero2;
             numero2 = auxiliar + numero1;
             System.out.println(numero2);
         }
        
    }
    
}
