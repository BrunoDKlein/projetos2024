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
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoideal = 0;
        System.out.println("Digite sua altura em cm");
        double altura = entrada.nextInt();
        System.out.println("Digite seu sexo em F ou M");
        String sexo = entrada.next();
        if (sexo.equals("M")) {
            pesoideal = (72.7 * (altura / 100)) - 58;
        } else if (sexo.equals("F")) {
            pesoideal = (62.1 * (altura / 100)) - 44.7;
        } else {
            System.out.println("A entrada não é valida");
        }
        System.out.println("Seu peso ideal é: " + pesoideal + "Kg");
    }
}
