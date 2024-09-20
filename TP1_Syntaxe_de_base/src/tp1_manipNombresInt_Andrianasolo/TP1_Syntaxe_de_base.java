package tp1_manipNombresInt_Andrianasolo;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yohanann Andrianasolo
 * 20/09/2024
 */
public class TP1_Syntaxe_de_base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisisez un nombre : ");
        int var1=sc.nextInt();
        System.out.println("Saisisez un deuxieme nombre : ");
        int var2=sc.nextInt();
        
        int res1, res2, res3, res4, res5;
        res1 = var1 + var2;
        res2 = var1 - var2;
        res3 = var1*var2;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        res4 = var1/var2;
        res5 = var1%var2;
        System.out.println(res4);
        System.out.println(res5);
        
        
        
        
    }
    
}
