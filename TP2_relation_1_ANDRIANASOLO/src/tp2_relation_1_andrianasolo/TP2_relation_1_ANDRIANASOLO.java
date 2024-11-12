/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_andrianasolo;

/**
 *
 * @author yohan
 */
public class TP2_relation_1_ANDRIANASOLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne Bob = new Personne("Bobby", "Sixkiller");
        Personne Reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        Bob.liste_voitures[0] = uneClio ;
        Bob.nbVoiture = 1 ;
        uneClio.propietaire = Bob ;
        System.out.println("la premiere voiture de Bob est " + Bob.liste_voitures[0] ) ;
        Bob.liste_voitures[1] = uneAutreClio ;
        Bob.nbVoiture = 2 ;
        uneAutreClio.propietaire = Bob ;
        System.out.println("la deuxieme voiture de Bob est " + Bob.liste_voitures[1] ) ;
        Reno.liste_voitures[0] = une2008;
        Reno.nbVoiture = 1;
        une2008.propietaire = Reno;
        System.out.println("la premiere voiture de Reno est " + Reno.liste_voitures[0] ) ;


    }
    
}
