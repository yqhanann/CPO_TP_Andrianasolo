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
    public int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.Nom = nom;
        if (niveauAttaque > 0 && niveauAttaque < 100) {
            this.niveauAttaque = niveauAttaque;
        }
         this.niveauAttaque = niveauAttaque;
    }

    public double getAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return Nom;
    }
public int getNiveauAttaque() {
        return niveauAttaque;
    }
   @Override
    public String toString() {
        return "Arme: " + Nom + ", Niveau d'attaque: " + niveauAttaque;
    }

}
