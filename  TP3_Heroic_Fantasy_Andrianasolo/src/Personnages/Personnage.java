
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


import java.util.ArrayList;
import Armes.Arme;
import tp3_heroic_fantasy_andrianasolo.TP3_Heroic_Fantasy_Andrianasolo.etreVivant;
/**
 *
 * @author yohan
 */
public abstract class Personnage implements etreVivant {
   public static int totalPersonnages = 0;
    public static int totalGuerriers = 0;
    public static int totalMagiciens = 0;

    public String Nom;
    public int Vie;
    public Arme arme;
    public ArrayList<Arme> armePersonnage;
    Arme arme_en_main;
    
    public Personnage(String Nom, int Vie){
     this.Nom = Nom;
        this.Vie = Vie;
        this.armePersonnage = new ArrayList<>();
        totalPersonnages++;
   }
    
    public void seFatiguer() {
        this.Vie -= 10; // Perte de 10 points de vie
        if (this.Vie < 0) this.Vie = 0; // Évite les points de vie négatifs
    }

    
    public boolean estVivant() {
        return this.Vie > 0; // Un personnage est vivant si sa vie est positive
    }

   
    public void estAttaque(int points) {
        this.Vie -= points; // Réduction des points de vie
        if (this.Vie < 0) this.Vie = 0; // Évite les points de vie négatifs
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

   @Override
     protected void finalize() throws Throwable {
        totalPersonnages--;
        super.finalize();
    }
     
   public static String getStats() {
        return "Total Personnages: " + totalPersonnages +
               ", Total Guerriers: " + totalGuerriers +
               ", Total Magiciens: " + totalMagiciens;}     
    
   public abstract void attaquer(Personnage cible);
    
   public boolean aUneArmeEquipee() {
        return this.arme_en_main != null; // Vérifie si une arme est équipée
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Object : "+Nom+" "+","+Vie+","+arme_en_main;
        return chaine_a_retourner;
    }
}
