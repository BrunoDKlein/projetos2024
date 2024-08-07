/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoaojava;

import java.util.Scanner;

/**
 *
 * @author Mauri
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular o custo final de um carro");
        System.out.println("Digite o valor de fábrica do carro");
        Double vFabrica = entrada.nextDouble();
        System.out.println("O custo final do carro é: R$" + (vFabrica * 1.28 + vFabrica * 0.45));
    }
}
