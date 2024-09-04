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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite valores para calcular a soma e a média");
        double numero = 0;
        for (int i = 1; i <= 5; i++) {
            numero = numero + entrada.nextDouble();
        }
        System.out.println("Soma= " + numero + "\n" + "Média= " + numero / 5);
    }
}
