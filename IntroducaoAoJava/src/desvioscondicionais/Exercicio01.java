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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.next();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        if (idade < 15) {
            System.out.println(nome + " é criança");
        } else if (idade < 60) {
            System.out.println(nome + " é adulto(a)");
        } else {
            System.out.println(nome + " é idoso(a)");
        }
    }
}
