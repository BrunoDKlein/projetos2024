/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoaojava;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular área de retângulo");
        System.out.println("Digite a base do retângulo");
        Double base = entrada.nextDouble();
        System.out.println("Digite a altura do retângulo");
        Double altura = entrada.nextDouble();
        System.out.println("A área do retângulo é: " + base * altura);
    }
}
