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
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String estados[] = new String[5];
        String capitais[] = new String[5];
        int populacoes[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o estado " + (i + 1) + ":");
            estados[i] = entrada.next();
            System.out.println("Digite a capital do estado " + (i + 1) + ":");
            capitais[i] = entrada.next();
            System.out.println("Digite a população do estado " + (i + 1) + ":");
            populacoes[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(estados[i] + " - " + capitais[i] + " - " + populacoes[i]);
        }
    }
}
