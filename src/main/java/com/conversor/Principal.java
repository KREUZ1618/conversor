package com.conversor;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        TasaConversion tasa = new TasaConversion();

        
   while(true) {     
        System.out.println("Conversor de monedas");
        System.out.println("-------------------------\n");
        System.out.println("1 - Convertir de dólares USD a pesos MXN");
        System.out.println("2 - Convertir de dólares USD a euros EUR");
        System.out.println("3 - Convertir de dólares USD a euros CAD");
        System.out.println("4 - Convertir de pesos MXN a dólares USD");
        System.out.println("5 - Convertir de pesos MXN a dólares CAD");
        System.out.println("6 - Convertir de pesos MXN a euros EUR");
        System.out.println("7 - Convertir de euros EUR a pesos MXN");
        
        
        var opcion = Integer.valueOf(lectura.nextLine());
       
       
        switch (opcion) {
        case 1:
            tasa.buscarTasa("USD","MXN"); 
            break;
        case 2:
            tasa.buscarTasa("USD","EUR"); 
            break;
        case 3:
        	 tasa.buscarTasa("USD","CAD"); 
            break;
        case 4:
       	    tasa.buscarTasa("MXN","USD"); 
           break;
        case 5:
       	    tasa.buscarTasa("MXN","CAD"); 
           break;
        case 6:
       	   tasa.buscarTasa("MXN","EUR"); 
           break;
        case 7:
       	   tasa.buscarTasa("EUR","MXN"); 
           break;    
       
        default:
            
    }
        
        try{
            
            
            
            
            
            
            
        } catch (NumberFormatException exc){
        	exc.printStackTrace();
            System.out.println("Divisa no encontrada "+exc.getMessage());
        } 
        
        
   }     
        
        
        
        
    
    }
}
