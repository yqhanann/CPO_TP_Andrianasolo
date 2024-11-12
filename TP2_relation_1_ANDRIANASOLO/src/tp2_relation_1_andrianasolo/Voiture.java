/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_andrianasolo;

/**
 *
 * @author yohan
 */
public class Voiture {
    public String Modele;
    public int Puissance;
    public String Voiture;
    public Personne personne;
    public Personne propietaire;
    
    public Voiture(String modele, String voiture, int puis){
    this.Modele = modele;
    this.Voiture = voiture;  
    this.Puissance = puis;
    this.propietaire = null;
    
}
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Object : "+Modele+" "+Voiture+" "+ Puissance;
        return chaine_a_retourner;
}
}
