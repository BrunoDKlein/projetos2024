/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt();
        System.out.println("Digite o mês: ");
        String mes = entrada.next();
        switch (mes) {
            case "janeiro":
                System.out.println("Esse mês tem 31 dias");
                break;
            case "fevereiro":
                if (ano % 4 == 0) {
                    System.out.println("Esse mês tem 29 dias");
                } else {
                    System.out.println("Esse mês tem 28 dias");
                }
                break;
            case "março":
                System.out.println("Esse mês tem 31 dias");
                break;
            case "abril":
                System.out.println("Esse mês tem 30 dias");
                break;
            case "maio":
                System.out.println("Esse mês tem 31 dias");
                break;
            case "junho":
                System.out.println("Esse mês tem 30 dias");
                break;
            case "julho":
                System.out.println("Esse mês tem 31 dias");
                break;
            case "agosto":
                System.out.println("Esse mês tem 31 dias");
                break;
            case "setembro":
                System.out.println("Esse mês tem 30 dias");
                break;
            case "outubro":
                System.out.println("Esse mês tem 31 dias");
                break;
            case "novembro":
                System.out.println("Esse mês tem 30 dias");
                break;
            case "dezembro":
                System.out.println("Esse mês tem 31 dias");
                break;
            default:
                System.out.println("Esse mês não existe");

        }
    }
}
