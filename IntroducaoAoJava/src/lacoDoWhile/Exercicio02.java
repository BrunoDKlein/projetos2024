/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoDoWhile;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        int filme = 0;
        int lanche = 0;
        int quantFilmes = 0;
        int quantLanches = 0;
        double valorTotal = 0;
        double valorFilmes = 0;
        double valorLanches = 0;
        do {
            menuFilmes();
            System.out.println("Faça sua escolha (1, 2, 3, 4, 5): ");
            filme = entrada.nextInt();
            switch (filme) {
                case 1:
                    valorTotal += 20;
                    valorFilmes += 20;
                    quantFilmes++;
                    break;
                case 2:
                    valorTotal += 18;
                    valorFilmes += 18;
                    quantFilmes++;
                    break;
                case 3:
                    valorTotal += 22;
                    valorFilmes += 22;
                    quantFilmes++;
                    break;
                case 4:
                    valorTotal += 15;
                    valorFilmes += 15;
                    quantFilmes++;
                    break;
                case 5:
                    valorTotal += 25;
                    valorFilmes += 25;
                    quantFilmes++;
                    break;
                default:
                    System.out.println("Filme inválido");
                    break;
            }
            System.out.println("Quer escolher mais algum filme? S-sim, N-não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));

        do {
            menuLanches();
            System.out.println("Faça sua escolha (1, 2, 3, 4, 5): ");
            lanche = entrada.nextInt();
            switch (lanche) {
                case 1:
                    valorTotal += 10;
                    valorLanches += 10;
                    quantLanches++;
                    break;
                case 2:
                    valorTotal += 8;
                    valorLanches += 8;
                    quantLanches++;
                    break;
                case 3:
                    valorTotal += 12;
                    valorLanches += 12;
                    quantLanches++;
                    break;
                case 4:
                    valorTotal += 15;
                    valorLanches += 15;
                    quantLanches++;
                    break;
                case 5:
                    valorTotal += 5;
                    valorLanches += 5;
                    quantLanches++;
                    break;
                default:
                    System.out.println("Lanche inválido");
                    break;
            }
            System.out.println("Quer escolher mais algum lanche? S-sim, N-não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Você comprou " + quantFilmes + " ingresesos e " + quantLanches + " lanches\n"
                + "Valor dos filmes: R$" + valorFilmes + "\n"
                + "Valor dos lanches: R$" + valorLanches + "\n"
                + "Valor total: R$" + valorTotal);
    }

    public static void menuFilmes() {
        System.out.println("MENU FILMES: \n"
                + "1. Aventura Espacial - R$ 20,00\n"
                + "2. Comédia Romântica - R$ 18,00\n"
                + "3. Terror na Floresta - R$ 22,00\n"
                + "4. Documentário Animal - R$ 15,00\n"
                + "5. Filme de Ação - R$ 25,00");
    }

    public static void menuLanches() {
        System.out.println("MENU LANCHES: \n"
                + "1. Pipoca Média - R$ 10,00\n"
                + "2. Refrigerante - R$ 8,00\n"
                + "3. Nachos - R$ 12,00\n"
                + "4. Balde de Pipoca Grande - R$ 15,00\n"
                + "5. Chocolate - R$ 5,00");
    }
}
