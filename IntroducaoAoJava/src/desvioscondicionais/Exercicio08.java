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
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura em cm");
        double altura = entrada.nextDouble();
        System.out.println("Digite peso em Kg");
        double peso = entrada.nextDouble();
        double imc = peso / Math.pow((altura / 100), 2);
        if (imc < 18.5) {
            System.out.println("IMC " + imc + " = Abaixo do peso");
        } else if (imc <= 25) {
            System.out.println("IMC " + imc + " = Peso ideal");
        } else if (imc <= 30) {
            System.out.println("IMC " + imc + " = Acima do peso");
        } else {
            System.out.println("IMC " + imc + " = Obeso");
        }
    }
}
