/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoFor;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da aplicação inicial");
        double valorInicial = entrada.nextDouble();
        System.out.println("Digite a taxa de juros");
        double juros = entrada.nextDouble();
        double a = 0;
        for (int i = 1; i <= 10; i++) {
            a = valorInicial * Math.pow((1 + juros), i);
            System.out.printf("Valor %dº ano= %.2f %n", i, a);
        }
    }
}
