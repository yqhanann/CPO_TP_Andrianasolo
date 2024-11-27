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
        Epee Epee3 = new Epee("Epee3", 6, 3);
        Baton Chene = new Baton("Chene", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        Baton Baton3 = new Baton("Baton3", 5, 6);
        Guerrier Conan = new Guerrier("Conan", 78, true);
        Guerrier Lannister = new Guerrier("Lannister", 78, false);
        Magicien Gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimore = new Magicien("Garcimore", 65, true);
        
        Conan.rajouterArme(Charme);
        Conan.rajouterArme(Excalibure);
        Conan.rajouterArme(Durandal);
        Gandalf.rajouterArme(Chene);
        Gandalf.rajouterArme(Baton3);
        Gandalf.rajouterArme(Epee3);
        Conan.equiper_arme("Excalibure");
        
        
        ArrayList<Arme> listeArme = new ArrayList<Arme>();
        listeArme.add(Excalibure);
        listeArme.add(Durandal);
        listeArme.add(Chene);
        listeArme.add(Charme);
        
        Iterator<Arme> tabArme = listeArme.iterator();
        while (tabArme.hasNext()) {
            System.out.println(tabArme.next());
        }
            ArrayList<Personnage> listePersonnage = new ArrayList<Personnage>();
            Iterator<Personnage> tabPersonnage = listePersonnage.iterator();
            while (tabPersonnage.hasNext()) {
                System.out.println(tabPersonnage.next());
            }
                listePersonnage.add(Conan);
                listePersonnage.add(Lannister);
                listePersonnage.add(Gandalf);
                listePersonnage.add(Garcimore);
                
        ArrayList<Personnage> listeGuerrier = new ArrayList<Personnage>();
            Iterator<Personnage> tabGuerrier = listeGuerrier.iterator();
            while (tabGuerrier.hasNext()) {
                System.out.println(tabGuerrier.next());}
            
       for (int i =0; i<listeGuerrier.size() - 1; i++){
       if listePersonnage(i).Type
       }
       
        for (int i=0 ; i<listePersonnage.size() - 1; i++){
            System.out.println(listePersonnage.get(i));
        }
            System.out.println(Gandalf.armePersonnage);
            System.out.println(Gandalf);
            System.out.println(Conan);
    }
}
