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
public class ExercicioIndividual {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para coverter Fahrenheit para Célsius");
        System.out.println("Digite a temperatura em Fahrenheit");
        double f = entrada.nextDouble();
        double c = (f-32)*(5/9.0);
         System.out.println("Essa temperatura em Célsius é "+c);

}
}
