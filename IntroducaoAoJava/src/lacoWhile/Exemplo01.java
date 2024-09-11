/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor entre 0 e 10:");
        double numero = entrada.nextDouble();
        while (numero < 0 || numero > 10) {
            System.out.println("O numero informado não é válido");
            numero = entrada.nextDouble();
        }
        System.out.println("Número informado: "+numero);
    }
}
