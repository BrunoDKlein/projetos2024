/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int primDivisor = 1;
        boolean ePrimo = true;
        System.out.println("Digite um número");
        num = entrada.nextInt();

        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                ePrimo = false;
                divisor = num;
            }
        }
        System.out.println("O número é primo?: " + ePrimo);
    }
}
