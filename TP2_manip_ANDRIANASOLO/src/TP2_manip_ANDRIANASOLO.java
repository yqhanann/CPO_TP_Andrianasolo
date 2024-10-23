
import tp2_manip_andrianasolo.Moussaka;
import tp2_manip_andrianasolo.Tartiflette;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yohan
 */
public class TP2_manip_ANDRIANASOLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette inv1 = new Tartiflette(500) ;
    Tartiflette inv2 = new Tartiflette(600) ;
    Tartiflette assiette1 = inv2 ;
    Tartiflette assiette2 = inv1 ;
    /*une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ? Non*/
    
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +assiette1.nbCalories) ;
   
   Moussaka assiete3 = new Moussaka(500) ;
   Moussaka assiete4 = new Moussaka(500) ;
   Moussaka assiete5 = new Moussaka(500) ;
   Moussaka assiete6 = new Moussaka(500) ;
   Moussaka assiete7 = new Moussaka(500) ;
   Moussaka assiete8 = new Moussaka(500) ;
   Moussaka assiete9 = new Moussaka(500) ;
   Moussaka assiete10 = new Moussaka(500) ;
   Moussaka assiete11 = new Moussaka(500) ;
   Moussaka assiete12 = new Moussaka(500) ;
}
    /*Dernière question (rhétorique) : pourrait-on avoir un objet, et qu’une référence vers cet objet soit en
fait un attribut d’un autre objet?... et si oui, n’est-ce pas finalement une façon de modéliser une relation
entre deux objets ?
Oui c'est possible */
}