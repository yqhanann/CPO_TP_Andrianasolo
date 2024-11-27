package tp3_heroic_fantasy_andrianasolo;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
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
        Epee Excalibure = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Baton Chene = new Baton("Chene", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        Guerrier Conan = new Guerrier("Conan", 78, true);
        Guerrier Lannister = new Guerrier("Lannister", 78, false);
        Magicien Gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimore = new Magicien("Garcimore", 65, true);

        ArrayList<Arme> listeArme = new ArrayList<Arme>();
        listeArme.add(Excalibure);
        listeArme.add(Durandal);
        listeArme.add(Chene);
        listeArme.add(Charme);

        Iterator<Arme> tabArme = listeArme.iterator();
        while (tabArme.hasNext()) {
            System.out.println(tabArme.next());

            ArrayList<Personnage> listePersonnage = new ArrayList<Personnage>();
            Iterator<Personnage> tabPersonnage = listePersonnage.iterator();
            while (tabPersonnage.hasNext()) {
                System.out.println(tabPersonnage.next());

                listePersonnage.add(Conan);
                listePersonnage.add(Lannister);
                listePersonnage.add(Gandalf);
                listePersonnage.add(Garcimore);
            }
        }
    }
}
