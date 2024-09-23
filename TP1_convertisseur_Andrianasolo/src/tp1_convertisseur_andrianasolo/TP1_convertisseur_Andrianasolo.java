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
        System.out.println("Bonjour, saisissez une valeur à convertir    : ");
        double var = sc.nextDouble();
        
        System.out.println("Bonjour, saisissez une valeur à convertir    : ");
        String choix = sc.nextLine();
        if( "CelciusVersKelvin".equals(choix) ){
            double var2 = CelciusVersKelvin(var);
            System.out.println("degré Kelvin est égal à" +var2+ "degrés Celcius");
        }
        
        if( "KelvinVersCelcius".equals(choix) ){
            double var2 = KelvinVersCelcius(var);
            System.out.println("degré Celcius est égal à" +var2+ "degrés Kelvin");
        }
        if( "FarenheitVersCelcius".equals(choix) ){
            double var2 = FarenheitVersCelcius(var);
            System.out.println("degré Farenheit est égal à" +var2+ "degrés Celcius");
        }
        if( "CelciusVersFarenheit".equals(choix) ){
            double var2 = FarenheitVersCelcius(var);
            System.out.println("degré Farenheit est égal à" +var2+ "degrés Celcius");
        }
        if( "KelvinVersFarenheit".equals(choix) ){
            double var2 = KelvinVersFarenheit(var);
            System.out.println("degré Kelvin est égal à" +var2+ "degrés Farenheit");
        }
       if( "FarenheitVersKelvin".equals(choix) ){
            double var2 = FarenheitVersKelvin(var);
            System.out.println("degré Farenheit est égal à" +var2+ "degrés Kelvin");
        }
       
        
        
        
                
    }
    public static double CelciusVersKelvin(Double tCelcius){
        return(tCelcius+ 273.0);
    }
    public static double KelvinVersCelcius(Double tKelvin){
        return(tKelvin - 273.0);
    }
    public static  double FarenheitVersCelcius(Double tFarenheit){
        return((tFarenheit - 32)*5.0/9);
    }
    public static double CelciusVersFarenheit(Double tCelcius){
       return((tCelcius*9.0/5) + 32);
    }
    public static double KelvinVersFarenheit(Double tKelvin){
        return((tKelvin - 273.0) *9.0/5 + 32);
    }
    public static double FarenheitVersKelvin  (Double tFarenheit){
        return((tFarenheit - 32) *5.0/9 + 273);
    }
    
    
}
