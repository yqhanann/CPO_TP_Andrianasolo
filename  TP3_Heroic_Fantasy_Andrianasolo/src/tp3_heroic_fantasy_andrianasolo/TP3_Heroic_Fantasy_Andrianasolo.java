package tp3_heroic_fantasy_andrianasolo;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
import java.util.Iterator;

// un ArrayList de chaînes de caractères

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yohan
 */
public class TP3_Heroic_Fantasy_Andrianasolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibure  = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4,7);
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme",5,6);
        
        ArrayList<Arme> liste = new ArrayList<Arme>();
        liste.add(Excalibure);
        liste.add(Durandal);
        liste.add(Chene);
        liste.add(Charme);
        
 
    Iterator<Arme> iterator = liste.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }  
    }
}
