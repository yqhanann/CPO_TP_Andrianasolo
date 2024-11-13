/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_andrianasolo;

/**
 *
 * @author yohan
 */
public abstract class Personnage {
    public String Nom;
    public int Vie;
    
    public Personnage(String Nom, int Vie){
        this.Nom = Nom;
        this.Vie = Vie;

}
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Object : "+Nom+" "+Vie;
        return chaine_a_retourner;
    }
}
