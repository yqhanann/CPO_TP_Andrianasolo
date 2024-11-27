
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


import java.util.ArrayList;
import Armes.Arme;
/**
 *
 * @author yohan
 */
public abstract class Personnage {
    public String Nom;
    public int Vie;
    Arme ajouter;
    ArrayList<Arme> tab2 = new ArrayList<>();
    
    public Personnage(String Nom, int Vie){
        this.Nom = Nom;
        this.Vie = Vie;
    
        
   
        
        
}
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Object : "+Nom+" "+Vie;
        return chaine_a_retourner;
    }
}
