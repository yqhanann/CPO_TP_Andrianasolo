/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_andrianasolo;

/**
 *
 * @author yohan
 */
public class Personne {
    public String nom;
    public String prenom;
    public int nbVoiture;
    public Voiture[] liste_voitures;
    
    
    public Personne(String Nom, String Prenom){
        this.nom = Nom;
        this.prenom = Prenom;
        liste_voitures = new Voiture [3] ;
        nbVoiture = 0;
        
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Identité : "+prenom+" "+nom;
        return chaine_a_retourner;
}
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
    if (voiture_a_ajouter != null){
    return false;}
    if (this.nbVoiture >= 3){
    return false;}
    else{
        this.nbVoiture +=1;
        this.liste_voitures[nbVoiture] = voiture_a_ajouter;
        voiture_a_ajouter.propietaire  = this ;
        return true;
    }
    }
}
