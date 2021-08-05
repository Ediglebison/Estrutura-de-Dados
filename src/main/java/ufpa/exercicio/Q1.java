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
public class Q1 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        int cont = 0;
        while (cont <10) {
            Scanner input = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int ent = input.nextInt();

            for (int i = cont; i ==cont; i++) {
                lista[cont] = ent;
                cont++;
                break;
            }
        }
        for (int j = 0; j < lista.length; j++) {
            System.out.print(lista[j] + " ");
        }
    }

}
