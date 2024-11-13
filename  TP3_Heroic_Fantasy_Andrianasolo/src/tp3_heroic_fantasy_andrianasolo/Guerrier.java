/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_andrianasolo;

/**
 *
 * @author yohan
 */
public class Guerrier extends Personnage {
public boolean Confirmer;
    public Guerrier(String Nom, int Vie, boolean Confirmer) {
        super(Nom, Vie);
        this.Confirmer = Confirmer; 
        
    }

    public void setConfirmer(boolean Confirmer) {
        this.Confirmer = Confirmer;
    }
    
}
