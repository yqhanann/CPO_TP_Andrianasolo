
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
    public Arme arme;
    public ArrayList<Arme> armePersonnage;
    Arme arme_en_main;
    public String Type;
    public static int totalPersonnages = 0;
    public static int totalGuerriers = 0;
    public static int totalMagiciens = 0;
    
    public Personnage(String Nom, int Vie){
            this.armePersonnage = new ArrayList<>();
        this.Nom = Nom;
        this.Vie = Vie;
        totalPersonnages++;
   }
    
    public void rajouterArme(Arme arme){
    if(armePersonnage.size()<5){
        armePersonnage.add(arme);}

}   public void equiper_arme (String nomarme){
        for (int i=0 ; i<armePersonnage.size() ; i++){
            if (armePersonnage.get(1).getNom().equals(nomarme)){
                arme_en_main=armePersonnage.get(i);
                System.out.println("L'arme à été trouvé et équipée");  
        }
            
    }
    }
     
   
   public static String getStats() {
        return "Total Personnages: " + totalPersonnages +
               ", Total Guerriers: " + totalGuerriers +
               ", Total Magiciens: " + totalMagiciens;}     
        

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Object : "+Nom+" "+","+Vie+","+arme_en_main;
        return chaine_a_retourner;
    }
}
