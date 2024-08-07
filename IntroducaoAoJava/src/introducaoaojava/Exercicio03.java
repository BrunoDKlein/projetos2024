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
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para calcular quantidade de dias vividos");
        System.out.println("Digite quantos anos você tem");
        int anos = entrada.nextInt();
        System.out.println("Digite quantos meses você tem");
        int meses = entrada.nextInt();
        System.out.println("Digite quantos dias você tem");
        int dias = entrada.nextInt();
        System.out.println("A quantidade de dias vividos é: " + (anos * 365 + meses * 30 + dias));
    }
}
