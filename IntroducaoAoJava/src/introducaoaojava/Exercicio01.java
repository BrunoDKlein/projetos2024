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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        System.out.println("Antecessor: " + (valor - 1));
    }
}
