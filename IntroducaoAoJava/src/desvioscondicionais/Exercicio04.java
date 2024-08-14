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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        double numero = entrada.nextDouble();
       
        if (numero>=0) {
            numero=numero*2;
        } else {
            numero=numero*3;
        }
        System.out.println(numero);
    }
}
