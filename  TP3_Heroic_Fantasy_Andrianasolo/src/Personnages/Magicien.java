/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Baton;
import Personnages.Personnage;
/**
 *
 * @author yohan
 */
public class Magicien extends Personnage {

    public boolean estConfirme;

    public Magicien(String Nom, int Vie, boolean A_cheval) {
        super(Nom, Vie);
        this.estConfirme = estConfirme;
        totalMagiciens++;

    }
    protected void finalize() throws Throwable {
        totalMagiciens--;
        super.finalize();
    }

    /**
     *
     * @param cible
     */
    @Override
 public void attaquer(Personnage cible) {
        if (!this.aUneArmeEquipee()) {
            System.out.println(this.Nom + " n'a pas d'arme équipée pour attaquer !");
            return;
        }

        int degats = 0;
        if (this.arme_en_main instanceof Baton) {
            Baton baton = (Baton) this.arme_en_main;
            degats = baton.getNiveauAttaque() * baton.getAge();
        } else {
            degats = this.arme_en_main.getNiveauAttaque();
        }

        if (this.estConfirme) {
            degats /= 2; // Les dégâts sont divisés par 2 si le magicien est confirmé
        }

        cible.estAttaque(degats); // Applique les dégâts à la cible
        this.seFatiguer(); // Le magicien se fatigue après l'attaque

        System.out.println(this.Nom + " attaque " + cible.Nom + " avec " + this.arme_en_main.getNom() +
                " et inflige " + degats + " points de dégâts !");
    }
    
    public void setEstConfirme(boolean A_cheval) {
        this.estConfirme = estConfirme;
    }

}
