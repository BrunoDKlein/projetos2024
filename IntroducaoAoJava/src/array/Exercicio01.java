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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("Soma de todos os números: " + soma);
    }
}
