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
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular exponenciação");
        System.out.println("Digite a base");
        int base = entrada.nextInt();
        System.out.println("Digite o expoente");
        int expoente = entrada.nextInt();
        System.out.println("O resultado é: " + Math.pow(base, expoente));
    }
}
