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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int parar = 0;
        int prato = 0;
        int quantPratos = 0;
        double valorTotal = 0;
        int calorias = 0;
        do {
            menu();
            System.out.println("Faça seu pedido (1, 2, 3, 4, 5): ");
            prato = entrada.nextInt();
            switch (prato) {
                case 1:
                    valorTotal += 25;
                    quantPratos++;
                    calorias += 800;
                    break;
                case 2:
                    valorTotal += 20;
                    quantPratos++;
                    calorias += 600;
                    break;
                case 3:
                    valorTotal += 15;
                    quantPratos++;
                    calorias += 200;
                    break;
                case 4:
                    valorTotal += 30;
                    quantPratos++;
                    calorias += 900;
                    break;
                case 5:
                    valorTotal += 8;
                    quantPratos++;
                    calorias += 100;
                    break;
                default:
                    System.out.println("Prato inválido");
                    break;
            }
            System.out.println("Caso queira finalizar o pedido, digite 0, se quiser pedir mais pratos, digite qualquer número");
            parar = entrada.nextInt();
        } while (parar != 0);
        System.out.println("Você pediu " + quantPratos + " pratos\n"
                + "Valor total: R$" + valorTotal + "\n"
                + "Total de calorias: " + calorias + " calorias");
    }

    public static void menu() {
        System.out.println("MENU: \n"
                + "1. Pizza - R$ 25,00 - 800 calorias\n"
                + "2. Hamburguer - R$ 20,00 - 600 calorias\n"
                + "3. Salada - R$ 15,00 - 200 calorias\n"
                + "4. Lasanha - R$ 30,00 - 900 calorias\n"
                + "5. Suco - R$ 8,00 - 100 calorias");
    }
}
