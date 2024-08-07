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
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular nota final do aluno");
        System.out.println("Digite sua primeira nota");
        Double n1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota");
        Double n2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota");
        Double n3 = entrada.nextDouble();
        System.out.println("A média final é: " + (n1 * 2 + n2 * 3 + n3 * 5) / 10);
    }

}
