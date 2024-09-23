
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Yohanann Andrianasolo 23/09/2024
 */
public class TP1_guessMyNumber_ANDRIANASOLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Difficult\u00e9
                            Facile
                            Dur""");
        String Difficulte = sc.nextLine();
        int tent = 0;
        int n = generateurAleat.nextInt(100);
        if (Difficulte.equals("Facile")) {
            System.out.println("Saisisez un nombre entre 0 et 100");
            int var = sc.nextInt();

            while (var != n) {
                tent++;
                if (var > n) {
                    System.out.println("Trop grand");
                }
                if (var < n) {
                    System.out.println("Trop petit");
                }
            }
            if (var == n) {
                System.out.println("Trouvé vous avez fait " + tent + " tentatives");
            }

        }
        if (Difficulte.equals("Dur")) {
            int tentmax = 5;
            System.out.println("Saisisez un nombre entre 0 et 100");
            int var = sc.nextInt();

            while (var != n && tentmax != 0) {
                tent++;
                tentmax = tentmax - 1;
                if (var > n) {
                    System.out.println("Trop grand");
                }
                if (var < n) {
                    System.out.println("Trop petit");
                }
            }
            if (var == n) {
                System.out.println("Trouvé vous avez fait " + tent + " tentatives");
                if (tentmax == 0) {
                    System.out.println("Vous avez perdu");
                }
            }
        }
    }
}
