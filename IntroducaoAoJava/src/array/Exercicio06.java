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
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[6];
        String nome;
        int parar = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe um nome: ");
            nomes[i] = entrada.next();
        }
        System.out.println("Digite um nome para verificar se está no vetor: ");
        nome = entrada.next();
        for (int i = 0; i < 6; i++) {
            if (nome.equals(nomes[i])) {
                System.out.println("Este nome está no vetor na posição " + i);
                parar = 1;
            }
        }
        if (parar == 0) {
            System.out.println("Este nome não está no vetor");
        }
    }
}
