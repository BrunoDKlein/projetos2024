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
public class ExercicioExtra02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular raízes de equação do 2º grau\n"
                + "Digite o coeficiente a");
        double a = entrada.nextDouble();
        System.out.println("Digite o coeficiente b");
        double b = entrada.nextDouble();
        System.out.println("Digite o coeficiente c");
        double c = entrada.nextDouble();
        double x1;
        double x2;
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 && b == 0) {
            System.out.println("Equação degenerada");
        } else if (a == 0) {
            x1 = (-c) / b;
            System.out.println("X1= " + x1);
        } else if (a != 0 && c == 0) {
            x2 = (-b) / a;
            System.out.println("X1= 0 e X2= " + x2);
        } else if (a != 0 && c != 0 && delta >= 0) {
            x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
            x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
            System.out.println("X1= " + x1 + " X2= " + x2);
        } else if (a != 0 && c != 0 && delta < 0) {
            System.out.println("As raízes são complexas");
        }
    }
}
