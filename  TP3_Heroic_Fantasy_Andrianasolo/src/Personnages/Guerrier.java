/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Epee;
/**
 *
 * @author yohan
 */
public class Guerrier extends Personnage {

    public boolean Confirmer;
    public String Type;
    public boolean aCheval;
    
    public Guerrier(String Nom, int Vie, boolean Confirmer,boolean aCheval) {
        super(Nom, Vie);
        this.Confirmer = Confirmer;
        this.aCheval = aCheval;
        totalGuerriers++;
    }
    
    protected void finalize() throws Throwable {
        totalGuerriers--;
        super.finalize();
    }

    public void setConfirmer(boolean Confirmer) {
        this.Confirmer = Confirmer;
    }
     public void attaquer(Personnage cible) {
        if (!this.aUneArmeEquipee()) {
            System.out.println(this.Nom + " n'a pas d'arme équipée pour attaquer !");
            return;
        }

        int degats = 0;
        if (this.arme_en_main instanceof Epee) {
            Epee epee = (Epee) this.arme_en_main;
            degats = epee.getNiveauAttaque() * epee.getFinesse();
        } else {
            degats = this.arme_en_main.getNiveauAttaque();
        }

        if (this.aCheval) {
            degats /= 2; // Les dégâts sont divisés par 2 si le guerrier est à cheval
        }

        cible.estAttaque(degats); // Applique les dégâts à la cible
        this.seFatiguer(); // Le guerrier se fatigue après l'attaque

        System.out.println(this.Nom + " attaque " + cible.Nom + " avec " + this.arme_en_main.getNom() +
                " et inflige " + degats + " points de dégâts !");
    }

}
