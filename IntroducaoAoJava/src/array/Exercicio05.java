/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int vetor3[] = new int[5];
        int resultado = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os números para o vetor 1: ");
            vetor1[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os números para o vetor 2: ");
            vetor2[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetor3[i] = vetor1[i] * vetor2[i];
        }
        System.out.println("Números do vetor 3: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor3[i]);
        }
    }

}
