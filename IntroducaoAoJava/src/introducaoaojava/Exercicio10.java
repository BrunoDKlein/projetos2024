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
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para saber se está no esquadro");
        System.out.println("Digite o lado da primeira parede");
        int p1 = entrada.nextInt();
        System.out.println("Digite o lado da segunda parede");
        int p2 = entrada.nextInt();
        System.out.println("O comprimento de h para que esteja no esquadro deve ser: " + Math.sqrt((Math.pow(p1, 2) + (Math.pow(p2, 2)))));
    }
}
