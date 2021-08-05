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
public class Q4 {
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
        
        int temp = 0;
        for (int i = 0; i<vet2.length/2; i++) {

            temp = vet2[vet2.length-i-1];
            vet2[vet2.length-i-1] = vet2[i];
            vet2[i] = temp;
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
