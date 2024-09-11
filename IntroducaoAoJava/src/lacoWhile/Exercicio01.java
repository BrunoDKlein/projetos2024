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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a massa do composto em gramas: ");
        double massa = entrada.nextDouble();
        double massaI = massa;
        int s = 0;
        while (massa > 0.5) {
            massa = massa / 2;
            s = s + 50;
        }
        int h = s / 3600;
        int m = (s % 3600) / 60;
        s = s % 60;
        System.out.println("O tempo para esse composto ter massa menor que 0,5 gramas é: \nHoras: " + h + "\nMinutos: " + m + "\nSegundos: " + s + "\nMassa inicial: " + massaI + "\nMassa final: " + massa);
    }
}
