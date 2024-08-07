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
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para contar dinheiro");
        System.out.println("informe a quantidade de cédulas de R$ 2,00");
        int c2 = entrada.nextInt();
        System.out.println("informe a quantidade de cédulas de R$ 5,00");
        int c5 = entrada.nextInt();
        System.out.println("informe a quantidade de cédulas de R$ 10,00");
        int c10 = entrada.nextInt();
        System.out.println("informe a quantidade de cédulas de R$ 20,00");
        int c20 = entrada.nextInt();
        System.out.println("informe a quantidade de cédulas de R$ 50,00");
        int c50 = entrada.nextInt();
        System.out.println("informe a quantidade de cédulas de R$ 100,00");
        int c100 = entrada.nextInt();
        System.out.println("informe a quantidade de cédulas de R$ 200,00");
        int c200 = entrada.nextInt();
        System.out.println("O valor total é: R$ " + (c2 * 2 + c5 * 5 + c10 * 10 + c20 * 20 + c50 * 50 + c100 * 100 + c200 * 200));
    }
}
