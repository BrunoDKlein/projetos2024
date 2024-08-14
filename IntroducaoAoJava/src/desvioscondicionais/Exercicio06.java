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
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor 1");
        double v1 = entrada.nextDouble();
        System.out.println("Digite o valor 2");
        double v2 = entrada.nextDouble();
        System.out.println("Digite o valor 3");
        double v3 = entrada.nextDouble();

        if (v1 > v2 && v1 > v3 && v2 > v3) {
            System.out.println(v1 + "; " + v2 + "; " + v3);
        } else if (v1 > v2 && v1 > v3 && v2 < v3) {
            System.out.println(v1 + "; " + v3 + "; " + v2);
        } else if (v2 > v1 && v2 > v3 && v1 > v3) {
            System.out.println(v2 + "; " + v1 + "; " + v3);
        } else if (v2 > v1 && v2 > v3 && v1 < v3) {
            System.out.println(v2 + "; " + v3 + "; " + v1);
        } else if (v2 > v1) {
            System.out.println(v3 + "; " + v2 + "; " + v1);
        } else {
            System.out.println(v3 + "; " + v1 + "; " + v2);
        }
    }
}