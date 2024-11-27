/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author yohan
 */
public class Epee extends Arme {
    private int finesse;
    public double indice;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        
        this.finesse = finesse;
        
        if (niveauAttaque > 0 && niveauAttaque < 100) {
            this.niveauAttaque = niveauAttaque;
        }
    }
 public int getFinesse() {
        return finesse;
    }
@Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}
