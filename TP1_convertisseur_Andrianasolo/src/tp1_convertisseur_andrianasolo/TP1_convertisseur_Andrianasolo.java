/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_andrianasolo;

import java.util.Scanner;

/**
 *
 * @author yohanann Andrianasolo
 */
public class TP1_convertisseur_Andrianasolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double var1 = sc.nextDouble();
        double temp; 
        temp = var1 + 273.0;
        System.out.println(temp);
        
        System.out.println("");
        
        
        
       
        
        
        
                
    }
    public static void CelciusVersKelvin(Double tCelcius){
        System.out.println(tCelcius+ 273.0);
    }
    public static void KelvinVersCelcius(Double tKelvin){
        System.out.println(tKelvin - 273.0);
    }
    public static void FarenheitVersCelcius(Double tFarenheit){
        System.out.println((tFarenheit - 32)*5/9);
    }
    public static void CelciusVersFarenheit(Double tCelcius){
        System.out.println((tCelcius*9/5) + 32);
    }
    public static void KelvinVersFarenheit(Double tKelvin){
        System.out.println((tKelvin - 273.0) *9/5 + 32);
    }
    public static void FarenheitVersKelvin  (Double tFarenheit){
        System.out.println((tFarenheit - 32) *5/9 + 273);
    }
    
    
}
