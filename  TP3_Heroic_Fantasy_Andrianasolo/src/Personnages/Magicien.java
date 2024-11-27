/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Personnages.Personnage;
/**
 *
 * @author yohan
 */
public class Magicien extends Personnage {

    public boolean A_cheval;
    public String Type;

    public Magicien(String Nom, int Vie, boolean A_cheval) {
        super(Nom, Vie);
        this.A_cheval = A_cheval;
        this.Type = "Magicien";

    }

    public void setA_cheval(boolean A_cheval) {
        this.A_cheval = A_cheval;
    }

}
