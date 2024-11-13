/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author yohan
 */
public abstract class Arme {
    public String Nom;
    public double Attaque;
   
    
    
public Arme(String nom, double attaque){
this.Nom = nom;
if (attaque>0 && attaque <100)
{this.Attaque = attaque;}
}

public double return_Attaque(){
    return Attaque;
}
public String return_Nom(){
return Nom;
}

@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Object : "+Nom+" "+Attaque;
    return chaine_a_retourner;
}


}

