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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int id = 0;
        double altura = 0;
        double peso = 0;
        double maiorAltura = 0;
        double maiorPeso = 0;
        double menorAltura = 1000000000;
        double menorPeso = 1000000000;
        int finalizar = 1;
        int idA = 0;
        int idB = 0;
        int idM = 0;
        int idG = 0;
        while (finalizar != 0) {
            System.out.println("Informe seu id: ");
            id = entrada.nextInt();
            System.out.println("Informe sua altura em cm: ");
            altura = entrada.nextDouble();
            System.out.println("Informe seu peso em kg: ");
            peso = entrada.nextDouble();
            if (altura > maiorAltura) {
                maiorAltura = altura;
                idA = id;
            }
            if (altura <= menorAltura) {
                menorAltura = altura;
                idB = id;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
                idG = id;
            }
            if (peso <= menorPeso) {
                menorPeso = peso;
                idM = id;
            }
            System.out.println("Caso queira finalizar, digite 0, caso contrário, digite qualquer outro número");
            finalizar = entrada.nextInt();
        }
        System.out.println("#Cliente mais alto:\nID: " + idA + "\nAltura: " + maiorAltura);
        System.out.println("#Cliente mais baixo:\nID: " + idB + "\nAltura: " + menorAltura);
        System.out.println("#Cliente mais pesado:\nID: " + idG + "\nPeso: " + maiorPeso);
        System.out.println("#Cliente mais leve:\nID: " + idM + "\nPeso: " + menorPeso);
    }
}
