/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_andrianasolo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yohanann ANDRIANASOLO
 */
public class TP1_stats_ANDRIANASOLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] tableau = new double[6]; // Créer un tableau de 6 éléments
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random(); // Initialiser le générateur aléatoire

        System.out.print("Saisissez une valeur (m) : ");
        int m = sc.nextInt(); // Lire la valeur de m
        
        // Remplissage du tableau avec des valeurs aléatoires
        for(int i = 0; i < m; i++){ // Commence à 0 et continue jusqu'à m
            int alea = generateurAleat.nextInt(6); // Générer un nombre aléatoire entre 0 et 5
            tableau[alea] = tableau[alea] + 1; // Incrémenter la case correspondante dans le tableau
        }

        // Afficher le tableau final
        System.out.println("Tableau des occurrences : " + Arrays.toString(tableau));
    }   
}
