/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_andrianasolo;

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
        int[] tableau = new int[6];
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int alea = 0;
        
        for(int i = 1; i != m; i++){
            alea = generateurAleat.nextInt(5);
            tableau[alea] = tableau[alea] + 1;
            
            
        }
    
        
    }
    
}
