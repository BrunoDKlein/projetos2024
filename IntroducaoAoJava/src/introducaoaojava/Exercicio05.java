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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular reajuste salarial");
        System.out.println("Digite seu salário atual em R$");
        Double salario = entrada.nextDouble();
        System.out.println("Digite o valor do reajuste em %");
        Double reajuste = entrada.nextDouble();
        System.out.println("O valor do salário reajustado é: R$" + (salario + (salario * (reajuste / 100))));
    }
}
