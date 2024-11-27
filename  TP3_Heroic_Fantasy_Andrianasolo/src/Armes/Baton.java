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

    public Baton(String nom, double attaque, double indice) {
        super(nom, attaque);
        this.indice = indice;
        if (attaque > 0 && attaque < 100) {
            this.Attaque = attaque;
        }

    }

}
