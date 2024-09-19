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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[8];
        double media = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número");
            vetor[i] = entrada.nextDouble();
        }
        for (int i = 0; i < 8; i++) {
            media = media + vetor[i];
        }
        media = media / vetor.length;
        System.out.println("Média: " + media);
        System.out.println("Números que estão acima da média: ");
        for (int i = 0; i < 8; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
