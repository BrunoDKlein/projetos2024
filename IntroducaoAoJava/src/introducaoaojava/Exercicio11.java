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
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para escrever a tabuada");
        System.out.println("Digite do qual você quer saber a tabuada");
        int numero = entrada.nextInt();
        System.out.println("Tabuada: " + "\n" + numero * 0 + "\n" + numero * 1 + "\n" + numero * 2 + "\n" + numero * 3 + "\n" + numero * 4 + "\n" + numero * 5 + "\n" + numero * 6 + "\n" + numero * 7 + "\n" + numero * 8 + "\n" + numero * 9 + "\n" + numero * 10);

    }
}
