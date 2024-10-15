
import tp2_bieres_andrianasolo.BouteilleBiere;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ANDRIANASOLO YOHANANN
 */
public class TP2_Bieres_ANDRIANASOLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",(float)7.0 ,"Dubuisson", true) ;
    BouteilleBiere Leffe = new BouteilleBiere("Abbaye de Leffe",(float)6.6,"Leffe", true);
    BouteilleBiere test = new BouteilleBiere("testtest",(float)6.6,"TEST", true);
    System.out.println(uneBiere);
    System.out.println(Leffe);
    System.out.println(test);
    test.Decapsuler();
    test.Decapsuler();
    
    }
    
}
