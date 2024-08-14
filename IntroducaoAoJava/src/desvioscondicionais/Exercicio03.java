/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c;
        System.out.println("Digite o valor a");
        double a = entrada.nextDouble();
        System.out.println("Digite o valor b");
        double b = entrada.nextDouble();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println(c);
    }
}
