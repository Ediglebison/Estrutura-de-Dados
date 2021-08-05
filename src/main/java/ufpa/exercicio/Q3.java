/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpa.exercicio;

import java.util.Scanner;

/**
 *
 * @author bi_nh
 */
public class Q3 {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int cont = 0;
        while (cont <5) {
            Scanner input = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int ent = input.nextInt();

            for (int i = cont; i ==cont; i++) {
                vet1[cont] = ent;
                vet2[cont] = ent;
                cont++;
                break;
            }
        }
        
        System.out.print("\nvet1: ");
        for (int j = 0; j < vet1.length; j++) {
            System.out.print(vet1[j] + " ");
        }
        System.out.print("\nvet2: ");
        for (int c = 0; c < vet2.length; c++) {
            System.out.print(vet2[c] + " ");
        }
    }

}
