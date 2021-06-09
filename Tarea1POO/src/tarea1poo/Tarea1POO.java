/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1poo;

/**
 *
 * @author jaime andres
 */
public class Tarea1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 12;
        
        if(edad < 2){
            System.out.println("Bebes");
        }else if(edad < 12){
            System.out.println("Ninos");
        }else if(edad < 18){
            System.out.println("Jovenes");
        }else if(edad < 18){
            System.out.println("Adultos");
        }else{
            System.out.println("Adultos mayores");
        }
        
        int mes = 3;
        if(mes == 1){
            System.out.println("Enero");
        }else if(mes == 2){
            System.out.println("Febrero");
        }else if(mes == 3){
            System.out.println("Marzo");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Mayo");
        }else if(mes == 6){
            System.out.println("Junio");
        }else if(mes == 7){
            System.out.println("Julio");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Septiembre");
        }else if(mes == 10){
            System.out.println("Octubre");
        }else if (mes == 11){
            System.out.println("Noviembre");
        }else if (mes == 12){
            System.out.println("Diciembre");
        }else{
            System.out.println("El numero del mes no existe");
        }
        
        switch(mes){
            case 1: 
                System.out.println("Enero");
                break;
            case 2: 
                System.out.println("Febrero");
                break;
            case 3: 
                System.out.println("Marzo");
                break;
            case 4: 
                System.out.println("Abril");
                break;
            case 5: 
                System.out.println("Mayo");
                break;
            case 6: 
                System.out.println("Junio");
                break;
            case 7: 
                System.out.println("Julio");
                break;
            case 8: 
                System.out.println("Agosto");
                break;
            case 9: 
                System.out.println("Septiembre");
                break;
            case 10: 
                System.out.println("Octubre");
                break;
            case 11: 
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }
    }
    
}
