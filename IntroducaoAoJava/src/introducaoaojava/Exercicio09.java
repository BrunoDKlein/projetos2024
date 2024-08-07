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
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular radiciação");
        System.out.println("Digite o radicando");
        int radicando = entrada.nextInt();
        System.out.println("A raiz é: " + Math.sqrt(radicando));
    }
}
