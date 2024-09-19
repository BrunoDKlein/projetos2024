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
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[10];
        int numNegativos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            vetor[i] = entrada.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                numNegativos++;
            }
        }
        System.out.println("Quantidade de números negativos: " + numNegativos);
    }
}
