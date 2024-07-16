package com.conversor;


import com.google.gson.Gson;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class TasaConversion {
	
	
    public void buscarTasa(String divisa1, String divisa2){
    	
    	Scanner lectura = new Scanner(System.in);
    	System.out.println("Introduza el monto");
    	
    	var monto = Float.valueOf(lectura.nextLine());
    	
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f4e5ad3c9256f368ec8935cf/latest/"+divisa1);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            
            System.out.println(response.body()); 

        
          Divisa divisa= new Gson().fromJson(response.body(), Divisa.class);  
          
         
         

          Method method=divisa.getConversion_rates().getClass().getDeclaredMethod("get"+divisa2);
         
          Double rate= (Double) method.invoke(divisa.getConversion_rates());
          
          
          float conversion=(float) (rate*monto);
          
   
         
          System.out.println("la conversión de " +monto+ " "+divisa1+" es igual a "+String.format("%.2f",conversion)+" "+divisa2); 
       
           
        } catch (Exception exc) {
        	exc.printStackTrace();
            throw new RuntimeException("No se encontró la divisa");
        }
    }
}