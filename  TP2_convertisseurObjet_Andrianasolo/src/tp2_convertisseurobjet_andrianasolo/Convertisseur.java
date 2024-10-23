package tp2_convertisseurobjet_andrianasolo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yohan
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur(){
        nbConversions = 0;
}
    public  double CelciusVersKelvin(Double tCelcius){
        nbConversions++;
        return(tCelcius+ 273.0);
        
    }
    public  double KelvinVersCelcius(Double tKelvin){
        nbConversions++;
        return(tKelvin - 273.0);
        
    }
    public   double FarenheitVersCelcius(Double tFarenheit){
        nbConversions++;
        return((tFarenheit - 32)*5.0/9);
       
    }
    public  double CelciusVersFarenheit(Double tCelcius){
       nbConversions++;
        return((tCelcius*9.0/5) + 32);
       
    }
    public  double KelvinVersFarenheit(Double tKelvin){
        nbConversions++;
        return((tKelvin - 273.0) *9.0/5 + 32);
       
    }
    public  double FarenheitVersKelvin  (Double tFarenheit){
        nbConversions++;
        return((tFarenheit - 32) *5.0/9 + 273);
       
    }
   
       
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }


}
