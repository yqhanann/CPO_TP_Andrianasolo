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
public class Baton extends Arme {

    public double indice;
    private int age;

    public Baton(String nom, int niveauAttaque, double indice) {
        super(nom, niveauAttaque);
        this.indice = indice;
        if (niveauAttaque > 0 && niveauAttaque < 100) {
            this.niveauAttaque = niveauAttaque;
        }
        

    }
    public int getAge() {
        return age;
    }
}
